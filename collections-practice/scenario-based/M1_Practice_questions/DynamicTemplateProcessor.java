import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DynamicTemplateProcessor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int n=Integer.parseInt(sc.nextLine());

        for (int i=0;i<n;i++){

            String line=sc.nextLine();


            Pattern pattern=Pattern.compile("\\$\\{(\\w+):(.*?)\\}");

            Matcher matcher=pattern.matcher(line);

            StringBuffer result=new StringBuffer();


            while(matcher.find()){

                String type=matcher.group(1);

                String value=matcher.group(2);

                String replacement="";

                switch(type){

                    case "UPPER":
                        replacement=value.toUpperCase();

                        break;

                    case "LOWER":
                        replacement=value.toLowerCase();

                        break;

                    case "DATE":
                        replacement=processDate(value);

                        break;

                    case "REPEAT":
                        replacement=processRepeat(value);

                        break;

                    default:
                        replacement="INVALID";

                }



                matcher.appendReplacement(result,replacement);
            }

            matcher.appendTail(result);


            System.out.println(result.toString());
        }
    }

    static String processDate(String date){

        try{
            String[] parts=date.split("-");

            int dd=Integer.parseInt(parts[0]);

            int mm=Integer.parseInt(parts[1]);

            int yyyy=Integer.parseInt(parts[2]);

            if (dd<1||dd>31||mm<1||mm>12)

                return "INVALID";

            return yyyy+"/"+String.format("%02d",mm)+"/"+String.format("%02d",dd);

        }
        catch(Exception e){
            return "INVALID";
        }

    }

    static String processRepeat(String val){

        try {
            String[] parts =val.split(",");
            String word=parts[0];

            int count=Integer.parseInt(parts[1]);

            StringBuilder sb=new StringBuilder();

            for(int i=0;i<count;i++){

                sb.append(word);
            }

            return sb.toString();

        } catch(Exception e) {

            return "INVALID";
        }
    }
}