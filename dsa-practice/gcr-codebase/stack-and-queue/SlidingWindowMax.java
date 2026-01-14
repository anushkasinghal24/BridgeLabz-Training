/*Sliding Window Maximum
Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
 */
import java.util.*;

public class SlidingWindowMax {

    public int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        Deque<Integer> deq = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            
            while (!deq.isEmpty() && deq.getFirst() <= i - k){
                deq.pollFirst();
            }
            

            while (!deq.isEmpty() && nums[deq.getLast()] < nums[i]){
                deq.pollLast();
            }
            
            deq.addLast(i);
            
            if (i >= k - 1) {
                res.addLast(nums[deq.getFirst()]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args){
        SlidingWindowMax solution = new SlidingWindowMax();
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(solution.maxSlidingWindow(arr, 3)));

    }

}
