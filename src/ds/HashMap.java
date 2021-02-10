package ds;

import java.util.Arrays;
import java.util.Map;

class Mnode<K, V> {
    int hash;
    K key;
    V value;
    Mnode next = null;

    Mnode(int hash, K key, V value){
        this.hash = hash;
        this.key = key;
        this.value = value;
    }
}

public class HashMap<K, V> {
    transient Mnode[] table = new Mnode[100];

    int getHash(K key){
        return key.hashCode() % 100;
    }

    Mnode getEnd(K key){
        Mnode head = table[getHash(key)];
        while(head.next != null){
            head = head.next;
        }
        return head;
    }

    void put(K key, V value) {
        if(table[getHash(key)] == null) {
            table[getHash(key)] = new Mnode(getHash(key), key, value );
        }else{
            Mnode<K,V> end  = getEnd(key);
            Mnode newElem = new Mnode(getHash(key), key, value);
            end.next = newElem;
        }
    }

    V get(K key){
        if(table[getHash(key)].next == null) {
            return (V) table[getHash(key)].value;
        }else{
            Mnode end = table[getHash(key)];
            while(end != null){
                if(end.key.equals(key)){
                    return (V)end.value;
                }else {
                    end = end.next;
                }
            }

        }
        return null;
    }


    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("a", "naresh");
        map.put("b", "suresh");
        map.put("cd", "gopi");
        map.put("dc", "ganesh");
        map.put("e", "mahesh");
        map.put("Aa", "one");
        map.put("BB", "two");

        System.out.println(map.get("Aa"));
        System.out.println(map.get("BB"));
    }
}
