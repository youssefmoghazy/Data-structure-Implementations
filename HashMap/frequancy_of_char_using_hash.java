import java.util.HashMap;
import java.util.Scanner;

public class frequancy_of_char_using_hash {
    public static void main(String[] args) {
        HashMap<Character, Integer> table = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        for (char c : str.toCharArray()) {
            int value = table.containsKey(c) ? table.get(c) : 0;
            table.put(c, value + 1);
        }
        System.err.println(table);
    }
}