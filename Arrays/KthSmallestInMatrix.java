import java.util.PriorityQueue;

public class KthSmallestInMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1, n2)->n2-n1);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                pq.add(matrix[i][j]);
                if(pq.size() > k){
                    pq.poll();
                }
            }
        }
        return  pq.peek();
    }
}
