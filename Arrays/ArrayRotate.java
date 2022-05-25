public class ArrayRotate {
    public void rotateLeft(int arr[], int d, int n) {
        for (int i = 0; i < d; i++) {
            leftRotate(arr, n);
        }
    }

    public void leftRotate(int arr[], int n) {
        int temp;
        temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[n - 1] = temp;
    }

    public void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ArrayRotate rotate = new ArrayRotate();
        int arr[] = {1, 3, 54, 24, 21, 32, 42};
        rotate.rotateLeft(arr,3,7);
        rotate.printArray(arr,7);
    }
}