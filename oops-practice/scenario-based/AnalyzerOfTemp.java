public class AnalyzerOfTemp{
 

    public static void analyzeTemperature(float[][] temp){
        float hottestAvg = Float.MIN_VALUE;
        float coldestAvg = Float.MAX_VALUE;
        int hottestDay = 0 , coldestDay = 0;

        for (int i = 0 ; i < 7; i++) {
            float sum = 0;
            for (int j = 0 ; j < 24; j++){
                sum += temp[i][j];
            }
            float avg = sum / 24;
            System.out.println("Average temperature of Day " + (i + 1) + ": " + avg);

            if (avg > hottestAvg){
                hottestAvg = avg;
                hottestDay = i + 1;
            }

            if (avg < coldestAvg) {
                coldestAvg = avg;
                coldestDay = i + 1;
            }
        }

        System.out.println("Hottest Day: Day" + hottestDay);
        System.out.println("Coldest Day: Day" + coldestDay);
    }

    public static void main(String[] args){
        float[][] temperature = new float[7][24];

        // sample data
        for (int i = 0 ; i < 7 ; i++){
            for (int j = 0; j < 24; j++){
                temperature[i][j] = 20 + i; // dummy values
            }
        }

        analyzeTemperature(temperature);
    }
}