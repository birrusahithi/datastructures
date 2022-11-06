package Strings;
/*28. Find the Index of the First Occurrence in a String
        Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

        Input: haystack = "sadbutsad", needle = "sad"
        Output: 0
        Explanation: "sad" occurs at index 0 and 6.
        The first occurrence is at index 0, so we return 0.*/
public class IndexOfTheFirstOccurrence {
    public int strStr(String haystack, String needle){
        int nLength = needle.length();
        int number = haystack.length()-needle.length();
        for(int i=0; i<=number; i++){
            int k =i;
            int j = i+nLength-1;
            int left =0;
            System.out.println("out: "+k);
            System.out.println("out: "+j);
            while(k<=j && left<nLength){
                if(haystack.charAt(k)==needle.charAt(left)){
                    k++;
                    left++;
                    System.out.println("K: "+ k);
                    System.out.println("left"+ left);
                }
                else{
                    left = nLength+1;
                }
            }
            System.out.println("Final left: "+ left);
            System.out.println("Final j: "+j);
            if(left==nLength){
                return i;
            }
        }
        return -1;
    }
}
