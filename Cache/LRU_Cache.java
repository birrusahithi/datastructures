import java.util.HashMap;
import java.util.Map;

public class LRU_Cache {
    Map<Integer, LinkedNode> map = new HashMap<>();
    int size;
    int capacity;
    LinkedNode left;
    LinkedNode right;

    LRU_Cache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        left = new LinkedNode(0, 0);
        right = new LinkedNode(0, 0);
        left.next = right;
        right.prev = left;
    }

    class LinkedNode {
        int key;
        int value;
        LinkedNode prev;
        LinkedNode next;

        LinkedNode(int k, int v) {
            this.key = k;
            this.value = v;
            prev = null;
            next = null;
        }
    }

    public void insert(LinkedNode node) {
        node.prev = left;
        node.next = left.next;
        left.next.prev = node;
        left.next = node;

    }

    public void remove(LinkedNode node) {
        LinkedNode prev = node.prev;
        LinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void put(int key, int value) {
        LinkedNode node = map.get(key);
        if (node == null) {
            LinkedNode newnode = new LinkedNode(0, 0);
            newnode.key = key;
            newnode.value = value;
            map.put(key, newnode);
            insert(newnode);
            ++size;
            if (size > capacity) {
                LinkedNode res = right.prev;
                map.remove(res.key);
                remove(res);
                --size;

            } else {
                node.value = value;
                remove(node);
                insert(node);
            }

        }
    }

    public int get(int key) {
        LinkedNode node = map.get(key);
        if (node == null) {
            return -1;
        } else {
            remove(node);
            insert(node);

        }
        return node.value;
    }
}
