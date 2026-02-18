import java.util.*;
public class MinimumIndexSumOfTwoLists {

    
    public static String[] findRestaurant(String[] list1, String[] list2) {
        int min = 10000;
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i< list1.length; i++){
            for(int j = 0; j< list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(i + j <= min){
                        if(i + j < min){
                            arr.clear();
                            min = i + j;

                        }

                        arr.add(list1[i]);
                    }
                    break;
                }
                
            }
        }return arr.toArray(new String[0]); 
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Input for first list
        System.out.println("Enter number of restaurants in list1:");
        int n1 = sc.nextInt();
        sc.nextLine();  
        String[] list1 = new String[n1];
        System.out.println("Ente2r restaurants for list1:");
        for (int i = 0; i < n1; i++) {
            list1[i] = sc.nextLine();
        }

        // Input for second list
        System.out.println("Enter number of restaurants in list2:");
        int n2 = sc.nextInt();
        sc.nextLine();   

        String[] list2 = new String[n2];
        System.out.println("Enter restaurants for list2:");
        for (int i = 0; i < n2; i++) {
            list2[i] = sc.nextLine();
        }
        String[] result = findRestaurant(list1, list2);
        System.out.println("Common restaurant(s) with minimum index sum:");
        for (String s : result) {
            System.out.println(s);
        }

    }
}

