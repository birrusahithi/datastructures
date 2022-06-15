public class isMonotonic {
    public boolean isMonotonic(int[] array){
        return increasing(array) || decreasing(array);
    }
    public boolean increasing(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i]>=array[i+1]){
                return false;
            }
            }
        return true;
        }
        public boolean decreasing(int[] array){
        for(int i=0; i<array.length-1; i++){
            if(array[i]<=array[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        isMonotonic obj = new isMonotonic();
        int[] array = {4, 3, 2, 1};
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 1, 3, 4};
        boolean first = obj.isMonotonic(array);
       boolean second= obj.isMonotonic(array1);
        boolean third = obj.isMonotonic(array2);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}
