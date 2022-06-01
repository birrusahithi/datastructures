public class Median {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int[] arr = new int[nums1.length+nums2.length];
            double ans=0;
            int left =0;
            int right =0;
            int k =0;
            while (left<nums1.length && right<nums2.length){
                if(nums1[left]<=nums2[right]){
                    arr[k]=nums1[left];
                    left++;
                }
                else{
                    arr[k]= nums2[right];
                    right++;
                }
                k++;
            }
            while(left<nums1.length){
                arr[k]= nums1[left];
                left++;
                k++;
            }
            while(right<nums2.length){
                arr[k]= nums2[right];
                right++;
                k++;

            }
            int i=0, r = arr.length-1;
            if(arr.length % 2 !=0){
                int med = (r-i)/2;
                return (double)arr[med];
            }else{
                int med = (r-i)/2;
                ans = (double)(arr[med]+ arr[med+1])/2;


            }
            return ans;
        }


    }


