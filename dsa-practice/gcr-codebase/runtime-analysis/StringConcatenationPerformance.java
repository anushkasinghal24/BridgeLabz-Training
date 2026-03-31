/*Objective:
Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings.
Approach:
Using String (Immutable, creates new object each time)
Using StringBuilder (Fast, mutable, thread-unsafe)
Using StringBuffer (Thread-safe, slightly slower than StringBuilder)
 */
public class StringConcatenationPerformance{
    public static void testString(int n){
        String s = "";
        long start = System.currentTimeMillis();
        for(int i = 0; i<n; i++){
            s += "a";
        }

        long end = System.currentTimeMillis();
        System.out.println("String time:       "+(end-start)+" ms");



    }



    public static void testStringBuilder(int n){
        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();
        for(int i = 0; i<n; i++){
            sb.append("a");
        }
        


        long end = System.currentTimeMillis();
        System.out.println("String builder time: "+(end-start)+" ms");

    }




    public static void testStringBuffer(int n){
        StringBuffer sb = new StringBuffer();

        long start = System.currentTimeMillis();
        for(int i = 0; i<n; i++){
            sb.append("a");
        }


        long end = System.currentTimeMillis();
        System.out.println("String buffer time: "+(end-start)+" ms");

    }


    public static void main(String args[]){

        int[] size = {1000,10000,100000,500000};

        for(int n: size){
            System.out.println("Dataset size: "+n);
            testString(n);
            testStringBuilder(n);
            testStringBuffer(n);
            System.out.println();
        }

    }
}