public class tree_tast {
    public static void main(String[] args) {
        binary_search_tree tree1 = new binary_search_tree();
        tree1.insert(100);
        tree1.insert(20);
        tree1.insert(10);
        tree1.insert(30);
        tree1.insert(200);
        tree1.insert(150);
        tree1.insert(300);
        binary_search_tree tree2 = new binary_search_tree();
        tree2.insert(100);
        tree2.insert(20);
        tree2.insert(10);
        tree2.insert(30);
        tree2.insert(200);
        tree2.insert(150);
        tree2.insert(300);
        tree1.printlevelOrder();`
    }
}
