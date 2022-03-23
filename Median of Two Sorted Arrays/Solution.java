class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int m1 = -1;
        int m2 = -1;
        int m = nums1.length;
        int n = nums2.length;

        if ((m + n) % 2 != 0) {
            for (int count = 0; count <= (m + n) / 2; count++) {
                if (i != m && j != n && nums1[i] > nums2[j]) {
                    m1 = nums2[j++];
                } else if (i != m) {
                    m1 = nums1[i++];
                } else {
                    m1 = nums2[j++];
                }
            }
            return m1;
        } else {
            for (int count = 0; count <= (m + n) / 2; count++) {
                m2 = m1;
                if (i != m && j != n && nums1[i] > nums2[j]) {
                    m1 = nums2[j++];
                } else if (i != m) {
                    m1 = nums1[i++];
                } else {
                    m1 = nums2[j++];
                }
            }
            return (double) (m1 + m2) / 2;
        }
    }
}
