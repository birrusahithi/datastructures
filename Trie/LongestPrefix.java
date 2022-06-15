import java.util.HashMap;
import java.util.Map;
class TrieNode{
    Map<Character, TrieNode> children;
    boolean isEnd;
    TrieNode(){
        children = new HashMap<>();
        this.isEnd = false;
    }
}
class Trie {

    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    public void insert(String strs){
        if(strs.length()==0){
            root.isEnd = true;
        }
        TrieNode current = root;
        for(int j=0; j<strs.length(); j++){
            char c = strs.charAt(j);
            TrieNode node = current.children.get(c);
            if(node == null){
                node = new TrieNode();
                current.children.put(c, node);
            }
            current = node;
        }
        current.isEnd = true;
    }
}

class LongestPrefix{
    public String longestCommonPrefix(String[] strs){
        if(strs==null || strs.length==0){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        Trie obj = new Trie();
        StringBuilder prefix = new StringBuilder();

        for(int i =0; i<strs.length; i++){
            obj.insert(strs[i]);
        }
        TrieNode current = obj.root;
        while(current!=null && !current.isEnd && current.children.size()==1){
            for(Map.Entry<Character, TrieNode> map : current.children.entrySet()){
                prefix.append(map.getKey());
                current = map.getValue();
            }
        }
        return prefix.toString();
    }
}