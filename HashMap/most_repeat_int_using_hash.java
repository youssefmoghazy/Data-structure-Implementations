import java.util.HashMap;
import java.util.Scanner;

public class most_repeat_int_using_hash {
    public static void main(String[] args) {
        HashMap<Integer, Integer> table = new HashMap<>();
        int max_repeat=0;
        int element_of_max_repeat=0;
        Scanner scanner = new Scanner(System.in);
        int siza = scanner.nextInt();
        int[] array = new int[siza];
        for (int i = 0; i < siza; i++) {
            array[i] = scanner.nextInt();
            int value = table.containsKey (array[i])?table.get(array[i]):0;
            value++;
            table.put(array[i], value);
            if (value>max_repeat) {
                max_repeat=value;
                element_of_max_repeat=array[i];                
            }
        }
        scanner.close();
        System.out.println(element_of_max_repeat);
        //the time complexity of this method is O(n)
    }
}
