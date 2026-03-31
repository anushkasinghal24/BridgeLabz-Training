import java.util.Scanner;

public class KeyGenerationProgram {

    public static String generateKey(String str){
        str=str.toLowerCase();

        StringBuilder temp=new StringBuilder();
        for(char c:str.toCharArray()){
            if((int)c % 2 !=0){
                temp.append(c);
            }
        }

        temp.reverse();

        for(int i=0;i<temp.length();i++){
            if(i%2 == 0){
                temp.setCharAt(i,Character.toUpperCase(temp.charAt(i)));
            }
        }
        return temp.toString();

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            String str=sc.nextLine();

            if(str.length()==0){
                System.out.println("Invalid Input (empty string)");
                continue;
            }

            if(str.length()<6){
                System.out.println("Invalid Input (length<6)");
                continue;
            }

            if(str.contains(" ")){
                System.out.println("Invalid Input (contains empty space)");
                continue;
            }
            if(str.matches(".*\\d.*")){
                System.out.println("Invalid Input (contains digits)");
                continue;

            }
            if(!str.matches("[a-zA-Z]+")){
                System.out.println("Invalid Input (contains special characters)");
                continue;
            }

            String key = generateKey(str);
            System.out.println("The generated key is - "+key);
        }
    }


}