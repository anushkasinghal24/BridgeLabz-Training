import java.util.PriorityQueue;
import java.util.Collections;

public class MedianFinder {

	private PriorityQueue<Integer> maxHeap; // left half
	private PriorityQueue<Integer> minHeap; // right half

	public MedianFinder() {
		maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		minHeap = new PriorityQueue<>();
	}

	public void addNum(int num) {
		maxHeap.offer(num);

		// balance step 1
		minHeap.offer(maxHeap.poll());

		// balance step 2
		if (maxHeap.size() < minHeap.size()) {
			maxHeap.offer(minHeap.poll());
		}
	}

	public double findMedian() {
		if (maxHeap.size() > minHeap.size()) {
			return maxHeap.peek();
		}
		return (maxHeap.peek() + minHeap.peek()) / 2.0;
	}

	public static void main(String[] args) {
		MedianFinder mf = new MedianFinder();

		mf.addNum(1);
		System.out.println(mf.findMedian()); // 1.0

		mf.addNum(2);
		System.out.println(mf.findMedian()); // 1.5

		mf.addNum(3);
		System.out.println(mf.findMedian()); // 2.0
	}
}