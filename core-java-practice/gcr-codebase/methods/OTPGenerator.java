/*Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/
//package methods;
import java.util.*;

public class OTPGenerator{
    static int generateOTP(){
    	
        return (int)(Math.random()*900000)+100000;
        }


        static boolean uniqueOTPCheck(int[] otp){
        	
            for(int i = 0;i < otp.length ;i++){
            	
                for(int j = i+1;j < otp.length;j++){
                	
                    if(otp[i] == otp[j]){
                        return false;
                    }
                
                }
            }

            return true;
        }

        public static void main(String args[]){
            int[] otp=new int[10];
            for(int i=0;i<10;i++){
                otp[i]=generateOTP();
            }

            System.out.println("Generated otp");
            for(int i:otp){
                System.out.println(i);
            }

            if(uniqueOTPCheck(otp)){
                System.out.println("All otp are unique");
            }
            else{
            	
                System.out.println("Not unique");
           
            }
        }
}
