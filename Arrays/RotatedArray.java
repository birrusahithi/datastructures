public class RotatedArray {
    public int rotatedSortedArray(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int med = left+(right-left)/2;
            if(arr[med]==target){
                return med;
            }else if(arr[med]>arr[left]){
                if(target>=arr[left] && target<=arr[med]){
                    right = med-1;
                }else{
                    left= med+1;
                }
            }
            else{
                if(target<=arr[right]&& target>=arr[med]){
                    left=med+1;
                }else{
                    right = med-1;
                }

            }
        }
        return -1;

    }
}
