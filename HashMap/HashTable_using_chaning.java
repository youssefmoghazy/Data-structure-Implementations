import java.util.LinkedList;
import java.util.NoSuchElementException;

public class HashTable_using_chaning {
    private class Node {
        private int key;
        private String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    // Creating an array of linked lists of node type.
    private LinkedList<Node>[] Table;

    public HashTable_using_chaning(int value) {
        if (value > 0)
            Table = new LinkedList[value];
        else
            throw new ExceptionInInitializerError();
    }

    private int count = 0;

    // put method --> add new node or updata the value of the node
    public void put(int key, String value) {
        Node node = new Node(key, value);
        int index = Hash(key);
        if (Table[index] == null) {
            Table[index] = new LinkedList<>();
        }
        for (Node e : Table[index]) {
            if (e.key == key) {
                e.value = value;
                return;
            }
        }
        Table[index].add(node);
        count++;
    }

    // Hash method --> return the index of the node
    private int Hash(int key) {
        return key % Table.length;
    }

    // Hash method --> return the value of the node
    public String get(int Key) {
        int index = Hash(Key);
        if (Table[index] == null) {
            return null;
        }
        for (Node e : Table[index]) {
            if (e.key == Key)
                return e.value;
        }
        return null;
    }

    public void remove(int Key) {
        int index = Hash(Key);
        if (Table[index] == null) {
            throw new NoSuchElementException();
        } else {
            for (Node e : Table[index]) {
                if (e.key == Key) {
                    Table[index].remove(e);
                    count--;
                    return;
                }
            }
            throw new NoSuchElementException();
        }
    }

    // size method --> return the size of table
    public int size() {
        return count;
    }
}
