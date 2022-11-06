package Arrays;
/*
692. Top K Frequent Words
        Given an array of strings words and an integer k, return the k most frequent strings.

        Return the answer sorted by the frequency from highest to lowest. Sort the words with the same frequency by their lexicographical order.

        Input: words = ["i","love","leetcode","i","love","coding"], k = 2
        Output: ["i","love"]
        Explanation: "i" and "love" are the two most frequent words.
        Note that "i" comes before "love" due to a lower alphabetical order.
*/

public class TopKFreaquentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(String s: words){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((n1, n2) -> map.get(n1).equals(map.get(n2)) ? n2.compareTo(n1) : map.get(n1)- map.get(n2));

        for(String s: map.keySet()){
            System.out.println("String" + s);
            pq.add(s);
            if(pq.size()>k){
                String h =  pq.poll();
                System.out.println("Str :" + h);
            }
        }
        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }
}
