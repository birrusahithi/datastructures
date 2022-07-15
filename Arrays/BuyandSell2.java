public class BuyandSell2 {
    public int maxprofit(int[] arr){
        int maxprofit =0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                maxprofit = maxprofit + (arr[i]-arr[i-1]);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        BuyandSell2 obj = new BuyandSell2();
        int[] arr = {7,1,5,3,6,4};
        obj.maxprofit(arr);
    }
}
