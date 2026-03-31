class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int s = 0;
        int e = height.length - 1;
        int max = 0;

        while (s < e) {   
            if (height[e] < height[s]) {
                int area = (e - s) * height[e];
                if (area > max) {
                    max = area;
                }
                e--;
            } else {
                int area = (e - s) * height[s];
                if (area > max) {
                    max = area;
                }
                s++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println("Maximum Area: " + result);
    }
}