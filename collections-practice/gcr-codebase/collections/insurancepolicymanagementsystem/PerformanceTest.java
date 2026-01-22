package insurancepolicymanagementsystem;

import java.util.*;

public class PerformanceTest{

    public static void testPerformance(){
        Set<Integer> hash = new HashSet<>();
        Set<Integer> linked = new LinkedHashSet<>();
        Set<Integer> tree = new TreeSet<>();


        int n = 100000;

        System.out.println("Performance test");

        long start = System.currentTimeMillis();

        for(int i=0 ; i<n; i++){
            hash.add(i);
        }

        System.out.println("Hashset time: " + (System.currentTimeMillis()-start)+"ms");



        start=System.currentTimeMillis();

        for(int i = 0; i<n; i++){
            linked.add(i);
        }

        System.out.println("Linkedhashset time: " + (System.currentTimeMillis()-start)+"ms");



        start=System.currentTimeMillis();

        for(int i=0;i<n;i++){
            tree.add(i);
        }

        System.out.println("TreeSet time : "+(System.currentTimeMillis()-start)+"ms");

    }
}
