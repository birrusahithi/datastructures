import java.util.HashMap;
import java.util.Map;


class Trie{
    class TrieNode{
        Map<Character, TrieNode> children;
        Boolean isendOfWord;
        TrieNode(){
            children = new HashMap<>();
            isendOfWord = false;
        }
    }
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }
    public void insert(String word){
        TrieNode current = root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            TrieNode node = current.children.get(c);
            if(node==null){
                node = new TrieNode();
                current.children.put(c, node);
            }
            current= node;
        }
        current.isendOfWord= true;
    }
    public boolean search(String word){
        TrieNode current =root;
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            TrieNode node = current.children.get(c);
            if(node==null){
                return false;

            }
            current = node;

        }
        return current.isendOfWord;
    }
    public boolean startsWith(String prefix){
        TrieNode current = root;
        for(int i=0; i<prefix.length(); i++){
            char ab = prefix.charAt(i);
            TrieNode node = current.children.get(ab);
            if(node ==null){
                return false;
            }
            current = node;
        }
        return true;
    }
}
