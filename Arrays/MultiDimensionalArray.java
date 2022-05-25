public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];
        arr[0][0] = 1;
        System.out.println(arr[0][0]);
        int array2[][] = {{1, 2, 3}, {2, 3, 4, 5, 6}, {1, 2}};
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println("array[" + i + "][" + j + "]=" + array2[i][j]);

            }

        }
        int [][][] array3 = {{{1,2},{1,3}},{{2,3},{1,2}},{{1,4},{3,3}}};
        for(int i=0; i<array3.length; i++){
            for(int j=0; j<array3[i].length; j++){
                for(int a=0; a<array3[j].length; a++){
                    System.out.println("a["+i+"]["+j+"]["+a+"]="+array3[i][j][a]);
                }
            }
        }

    }
}
