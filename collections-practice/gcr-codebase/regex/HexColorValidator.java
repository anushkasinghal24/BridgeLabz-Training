/* Validate a Hex Color Code
A valid hex color:
Starts with a #
Followed by 6 hexadecimal characters (0-9, A-F, a-f).
🔹 Example Inputs & Outputs
✅ "#FFA500" → Valid
✅ "#ff4500" → Valid
❌ "#123" → Invalid (too short)

 */
import java.util.*;

public class HexColorValidator{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hex color: ");
        String hex = sc.nextLine();

        if(hex.matches("^#[0-9A-Fa-f]{6}$")){
            System.out.println("Valid hex color");
        }
        else{
            System.err.println("Invalid hex color");
        }
    }
    }
