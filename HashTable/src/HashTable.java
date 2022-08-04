import java.util.Objects;

class HashTable<K, V> {
    final int size = 16;
    Map arr[] = new Map[size];

    public void put(K key, V value) {
       Map<K, V> entry = new Map<>(key, value);
       int index = calculateIndex(key);
       if(arr[index]==null){
           arr[index]= entry;
       }else{
           Map<K, V> temp = arr[index];
           while(temp!=null){
               if(temp.key.equals(key)){
                   temp.value=value;
               }
               temp=temp.next;
           }
           temp= entry;
       }
    }
    public V get(K key){
        int index = calculateIndex(key);
        if(arr[index]==null){
            return null;
        }
        if(arr[index].key.equals(key)){
            return (V) arr[index].value;
        }
        Map<K, V> temp = arr[index];
        while(temp.next!=null){
            if(temp.key.equals(key)){
                return temp.value;
            }
            temp = temp.next;
        }
       return null;
    }
    public boolean contains(K key){
        int index = calculateIndex(key);
        if(arr[index]==null){
            return false;
        }
        if(arr[index].key.equals(key)){
            return true;
        }
        Map<K, V> temp = arr[index];
        while(temp!=null){
            if(temp.key.equals(key)){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public boolean remove(K key){
        int index = calculateIndex(key);
        if(arr[index]==null){
            return false;
        }
        if(arr[index]!=null && arr[index].key.equals(key)){
            arr[index] = arr[index].next;
        }
        Map<K, V> current = arr[index];
        Map<K, V> prev = arr[index];
        while(current!=null){
            if(current.key.equals(key)){
                prev.next = current.next;
                return true;
            }
            prev = current;
            current= current.next;
        }
        return false;
    }

    public int calculateIndex(K key) {
        int a = Objects.hashCode(key);
        int index;
        if (a > 0) {
            index = a % size;
        } else {
            index = -a % size;
        }
        return index;
    }

}