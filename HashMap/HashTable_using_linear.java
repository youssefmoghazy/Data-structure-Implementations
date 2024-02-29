public class HashTable_using_linear {
    private class Node {
        private int key;
        private String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] table;
    int counter=0;
    public HashTable_using_linear(int value) {
        table = new Node[value];
    }

    public void put(int key, String value) {
        Node node = new Node(key, value);
        int index = Hash(key);
        while (table[index] != null) {
            index = Hash(index + 1);
        }
        table[index] = node;
        counter++;
    }

    private int Hash(int key) {
        int index = key % table.length;
        return index;
    }

    public String get(int key) throws Exception {
        int index = Hash(key);
        if (table[index].key == key) {
            return table[index].value;
        } else {
            int check = table.length;
            while (table[index].key != key) {
                index = Hash(index + 1);
                check--;
                if (check == 0) {
                    throw new Exception();
                }
            }
            return table[index].value;
        }
    }
    public void remove(int key) throws Exception{
        int index = Hash(key);
        if (table[index].key == key) {
            table[index]= null;
            counter--;
        } else {
            int check = table.length;
            while (table[index].key != key) {
                index = Hash(index + 1);
                check--;
                if (check == 0) {
                    throw new Exception();
                }
            }
            table[index]= null;
            counter--;
        }
    }
    public int size() {
        return counter;
    }
}
