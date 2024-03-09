import java.util.ArrayList;
import java.util.NoSuchElementException;

public class binary_search_tree {
    private class Node {
        private int value;
        private Node RightChild;
        private Node LeftChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node Root;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (Root == null) {
            Root = newNode;
            return;
        }
        Node parent = getPerantNode(value);
        if (value <= parent.value) {
            parent.LeftChild = newNode;
        } else {
            parent.RightChild = newNode;
        }
    }

    private Node getPerantNode(int value) {
        Node parent = null;
        Node current = Root;
        while (current != null) {
            parent = current;
            if (value <= current.value) {
                current = current.LeftChild;
            } else {
                current = current.RightChild;
            }
        }
        return parent;
    }

    public boolean Find(int value) {
        Node currentNode = Root;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return true;
            } else if (currentNode.value > value) {
                currentNode = currentNode.RightChild;
            } else {
                currentNode = currentNode.LeftChild;
            }
        }
        return false;
    }

    public void PreorderPrint() {
        PreorderPrint(Root);
    }

    private void PreorderPrint(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        System.out.println(rootNode.value);
        PreorderPrint(rootNode.LeftChild);
        PreorderPrint(rootNode.RightChild);
    }

    /*******************************************/
    public void InOrderPrint() {
        InOrderPrint(Root);
    }

    private void InOrderPrint(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        InOrderPrint(rootNode.LeftChild);
        System.out.println(rootNode.value);
        InOrderPrint(rootNode.RightChild);
    }

    public void PostOrderPrint() {
        PostOrderPrint(Root);
    }

    private void PostOrderPrint(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        PostOrderPrint(rootNode.LeftChild);
        PostOrderPrint(rootNode.RightChild);
        System.out.println(rootNode.value);
    }

    public void PrintDescendingOrder() {
        PrintDescendingOrder(Root);
    }

    private void PrintDescendingOrder(Node rootNode) {
        if (rootNode == null) {
            return;
        }
        PrintDescendingOrder(rootNode.RightChild);
        System.out.println(rootNode.value);
        PrintDescendingOrder(rootNode.LeftChild);
    }

    public int Max() {
        Node currentNode = Root;
        if (Root == null) {
            throw new NoSuchElementException();
        } else {
            while (currentNode.RightChild != null) {
                currentNode = currentNode.RightChild;
            }
            return currentNode.value;
        }
    }

    public int Min() {
        Node currentNode = Root;
        if (Root == null) {
            throw new NoSuchElementException();
        } else {
            while (currentNode.LeftChild != null) {
                currentNode = currentNode.LeftChild;
            }
            return currentNode.value;
        }
    }

    public boolean equals(binary_search_tree tree2) {
        return equals(Root, tree2.Root);
    }

    private boolean equals(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1.value == root2.value && equals(root1.LeftChild, root2.LeftChild)
                && equals(root1.RightChild, root2.RightChild)) {
            return true;
        }
        return false;
    }

    public int height() {
        return height(Root);
    }

    private int height(Node rootNode) {
        if (rootNode == null) {
            return -1;
        } else {
            return height(rootNode.LeftChild) > height(rootNode.RightChild) ? height(rootNode.LeftChild) + 1
                    : height(rootNode.RightChild) + 1;
        }
    }

    @SuppressWarnings("rawtypes")
    public ArrayList kthElementFromRoot(int h) {
        var array = new ArrayList<Integer>();
        kthElementFromRoot(Root, h, array);
        return array;
    }

    private void kthElementFromRoot(Node root, int h, ArrayList<Integer> array) {
        if(root==null){
            return;
        }
        if (h==0) {
            array.add(root.value);
        }
        else{
            kthElementFromRoot(root.LeftChild, h-1, array);
            kthElementFromRoot(root.RightChild, h-1, array);
        }
    }
    public void printlevelOrder(){
        for(int i=0;i<=height() ; i++){
            System.out.println(kthElementFromRoot(i));
        }
    }

}