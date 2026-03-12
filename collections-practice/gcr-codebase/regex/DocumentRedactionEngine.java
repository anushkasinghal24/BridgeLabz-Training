import java.util.*;
import java.util.regex.*;
public class DocumentRedactionEngine {

    public static String processLine(String input){

        input = input.replaceAll("ID:[A-Z]{3}\\d{6}","ID:XXX******");
        input = input.replaceAll("ACCT-\\d{4}-\\d{4}-(\\d{4})", "ACCT----$1");
        Pattern p = Pattern.compile("\\b(\\w+)(\\s+\\1\\b)+",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        StringBuffer sb = new StringBuffer();
        while(m.find()){
            m.appendReplacement(sb,m.group(1));
        }
        m.appendTail(sb);
        input = sb.toString();


        input = input.replaceAll("([!?\\.])\\1{2,}$","$1");
        return input;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String line = sc.nextLine();
            System.out.println(processLine(line));
        }
    }
    
}