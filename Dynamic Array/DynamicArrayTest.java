
public class DynamicArrayTest
{
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray(5);
        array.insert(10);
        array.insert(20); 
        array.insert(30);
        array.insert(40);
        array.insert(50);
        array.PrintArray();
        System.err.println(array.MAX());
        System.err.println(array.MIN());
        array.RemoveAt(array.IndexOf(30));
        array.PrintArray();

    }
}