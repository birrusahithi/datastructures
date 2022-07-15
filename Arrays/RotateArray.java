public class RotateArray {
    public void rotate(int[] arr, int k) {
        k %= arr.length;
        rotateArray(arr, 0, arr.length - 1);
        rotateArray(arr, 0, k - 1);
        rotateArray(arr, k, arr.length - 1);
    }

    public void rotateArray(int[] arr, int start, int end) {
        while(start<end){
            int num = arr[start];
            arr[start] = arr[end];
            arr[end]= num;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        obj.rotate(arr, k);
    }
}
