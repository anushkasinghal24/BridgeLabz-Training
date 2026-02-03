/*Smart Home Lighting Automation
○ Scenario: A building has smart lights. Different triggers (motion, time of day, voice
commands) need to execute different light patterns.
○ Task: Use lambdas to define these light activation behaviors dynamically without
creating multiple classes. */
import java.util.*;

@FunctionalInterface

interface LightAction{
    void activate();
}

public class LightAutomation{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Choose Trigger: ");
        System.out.print("1. Motion Detected");
        System.out.print("2. Time of Day");
        System.out.print("3. Voice Command");
        System.out.print("Enter choice: ");

        int choice=sc.nextInt();

        LightAction action=null;

        switch(choice){
            case 1:
                action =()-> System.out.println("Motion Detected->Bright Light On");
                break;
            case 2:
                action =()-> System.out.println("Time of Day->Warm Light On");
                break;
            case 3:
                action =()-> System.out.println("Voice Command->Party Light On");
                break;    
        }

        action.activate();

    }
}