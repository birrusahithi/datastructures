import java.util.Arrays;
import java.util.Collections;

public class MaxArea {
   /* BRUTE FORCE
   public int maxArea(int[] height){
        int maxarea = 0;
        for(int i = 0; i<height.length; i++){
            for(int j=i+1; j<height.length; j++){
                maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j-i));
            }
        }
     return maxarea;
    }

    */
   //TWO POINTER APPROACH
    public int maxArea(int[] height){
        int maxarea = 0;
       int l = 0;
       int r = height.length-1;
       while(l<r){
           maxarea = Math.max(maxarea, Math.min(height[l], height[r])*(r-l));
           if(height[l]<height[r]){
               l++;
           }
           else{
               r--;
           }
       }
       return maxarea;
    }


    public static void main(String[] args) {
        MaxArea obj = new MaxArea();
        int[] height = {2, 18, 4, 5, 3, 17, 6,};
        int a = obj.maxArea(height);
        System.out.println(a);


    }
}

