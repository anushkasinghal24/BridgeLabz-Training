import java.util.*;

public class IntersectionOfTwoArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();

		for (int num : nums1) {
			set.add(num);
		}

		for (int num : nums2) {
			if (set.remove(num)) { // avoids duplicates
				list.add(num);
			}
		}

		int[] ans = new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}

		return ans;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		int[] result = intersection(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}
}