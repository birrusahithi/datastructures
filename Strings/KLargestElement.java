import java.util.PriorityQueue;

public class KLargestElement {
    public String kLargestElement(String[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2)->n2-n1);
        int number =0;
       for(int i=0; i<arr.length; i++){
           String s = arr[i];
           int j =0;
           while(j<s.length()){
               char c = s.charAt(j);
               number = number *10 +c-'0';
               j++;
           }
           pq.add(number);
           number =0;
           if(pq.size()>k){
               pq.poll();
           }
       }
       String result = String.valueOf(pq.poll());
        System.out.println(result);
       return result;
    }
    public static void main(String[] args){
        KLargestElement obj = new KLargestElement();
        String[] arr = {"3","6","7","10"};
        String s = "sahithi,ankith,rohith";
        String[] a = s.split(",");
        System.out.println(a[0]);
        int k = 4;
        obj.kLargestElement(arr, k);
    }
}
