public class tree_tast {
    public static void main(String[] args) {
        binary_search_tree tree = new binary_search_tree();
        tree.insert(100);
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(200);
        tree.insert(150);
        tree.insert(300);
        System.out.println("Max value = "+tree.Max());
        System.out.println("Min value = "+tree.Min());
    }
}
