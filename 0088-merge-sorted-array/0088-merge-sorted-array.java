class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        // Copy back to nums1
        for (int l = 0; l < arr.length; l++) {
            nums1[l] = arr[l];
        }
    }
}
