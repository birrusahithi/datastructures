public class TransposeMatrix {
        public int[][] transpose(int[][] matrix) {
            int r = matrix.length;
            int c = matrix[0].length;
            int [][] res = new int[c][r];
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix[i].length; j++){
                    res[j][i]= matrix[i][j];
                }

            }
            return res;
        }
    }

