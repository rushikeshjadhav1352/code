class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
	int generalPointer = nums1.length - 1;
	m--;
	n--;

	while (m >= 0 && n >= 0) {
		if (nums1[m] > nums2[n]) {
			nums1[generalPointer] = nums1[m];
			m--;
		} else {
			nums1[generalPointer] = nums2[n];
			n--;
		}

		generalPointer--;
	}

	while (m >= 0) {
		nums1[generalPointer] = nums1[m];
		m--;
		generalPointer--;
	}

	while (n >= 0) {
		nums1[generalPointer] = nums2[n];
		n--;
		generalPointer--;
	}
}
}