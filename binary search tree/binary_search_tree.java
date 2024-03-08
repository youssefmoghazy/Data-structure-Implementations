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
    public void PreorderPrint(){
        PreorderPrint(Root);
    }
    private void PreorderPrint(Node rootNode){
        if(rootNode == null){
            return;
        }
        System.out.println(rootNode.value);
        PreorderPrint(rootNode.LeftChild);
        PreorderPrint(rootNode.RightChild);
    }
    /*******************************************/
    public void InOrderPrint(){
        InOrderPrint(Root);
    }
    private void InOrderPrint(Node rootNode){
        if(rootNode == null){
            return;
        }
        InOrderPrint(rootNode.LeftChild);
        System.out.println(rootNode.value);
        InOrderPrint(rootNode.RightChild);
    }
    public void PostOrderPrint(){
        PostOrderPrint(Root);
    }
    private void PostOrderPrint(Node rootNode){
        if(rootNode == null){
            return;
        }
        PostOrderPrint(rootNode.LeftChild);
        PostOrderPrint(rootNode.RightChild);
        System.out.println(rootNode.value);
    }
    public void PrintDescendingOrder(){
        PrintDescendingOrder(Root);
    }
    private void PrintDescendingOrder(Node rootNode){
        if(rootNode == null){
            return;
        }
        PrintDescendingOrder(rootNode.RightChild);
        System.out.println(rootNode.value);
        PrintDescendingOrder(rootNode.LeftChild);
    }
    public int Max(){
        Node currentNode = Root;
        if(Root == null){
            throw new NoSuchElementException();
        }
        else{
            while (currentNode.RightChild != null) {
                currentNode=currentNode.RightChild;
            }
            return currentNode.value;
        }
    } 
    public int Min(){
        Node currentNode = Root;
        if(Root == null){
            throw new NoSuchElementException();
        }
        else{
            while (currentNode.LeftChild != null) {
                currentNode=currentNode.LeftChild;
            }
            return currentNode.value;
        }
    } 




}