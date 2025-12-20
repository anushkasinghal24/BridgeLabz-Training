//Maya’s BMI Fitness Tracker 🏃‍♀️
//Maya, a fitness coach, wants to record the BMI of her clients.
//● Ask for height and weight.
//● Use formula BMI = weight / (height * height)
//● Print category using if-else: Underweight, Normal, Overweight.
//Use clear variable names and comments to maintain code hygiene.// package scenarioBased;
//package scenariobased;
import java.util.Scanner ;
public class BMIFitnessTracker {

    public static void main(String[] args)
    {


       // input section
        Scanner sc = new Scanner(System.in) ;
        System.out.println("******MAYA'S BMI CALCULATORS******") ;
        
        System.out.println("Enter your height in meters  : " );
        float height = sc.nextFloat();
        
        System.out.println("Enter your weight in kg : ") ;
        float weight = sc.nextFloat() ;


        // BMI CALCULATE

        float bmi = weight / ( height * height) ;

        
        
        // print results based on BMI

        if(18.5f <= bmi && bmi <= 24.9f) {
            System.out.println("Category: Normal");
            
        }else if(bmi < 18.5f) {
            System.out.println("Category: Underweight");
            
        }else{
            System.out.println("Category: Overweight");
            
        }
    }
}