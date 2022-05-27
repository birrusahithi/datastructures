public class BuySell {
    public int largestDiff(int[] array) {
        int largestdiff = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ( (array[j]-array[i])> largestdiff) {

                   largestdiff= array[j]-array[i];
                }
            }
        }
        return largestdiff;
    }

    public static void main(String[] args) {
        BuySell result = new BuySell();
        int[] array = {7, 1, 5, 3, 6, 4};
        result.largestDiff(array);
        System.out.println(result.largestDiff(array));
    }
}

