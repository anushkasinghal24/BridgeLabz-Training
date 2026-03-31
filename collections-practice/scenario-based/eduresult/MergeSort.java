package eduresult;

import java.util.*;

public class MergeSort{

    public static void mergeSort(List<Student> list){
        if(list.size() <= 1) return;

        int mid=list.size()/2;
        List<Student> left = new ArrayList<>(list.subList(0,mid));
        List<Student> right = new ArrayList<>(list.subList(mid,list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(list,left,right);


    }

    public static void merge(List<Student> result, List<Student> left, List<Student> right){
        int i = 0,j = 0;
        result.clear();
        while(i<left.size() && j < right.size()){
            if(left.get(i).marks >= right.get(j).marks){
                result.add(left.get(i++));

                
            }
            else{
                result.add(right.get(j++));
            }
        }
        while(i<left.size()){
            result.add(left.get(i++));
        }
        while(j<right.size()){
            result.add(right.get(j++));
        }
        
     }
                

}