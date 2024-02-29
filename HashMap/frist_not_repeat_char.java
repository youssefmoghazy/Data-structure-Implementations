import java.util.HashMap;
import java.util.Scanner;

public class frist_not_repeat_char {
    public static void main(String[] args) {
        HashMap<Character, Integer> table = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        for (char c : str.toCharArray()) {
            int value = table.containsKey(c) ? table.get(c) : 0;
            table.put(c, value + 1);
        }
        for (char c : str.toCharArray()) {
            if(table.get(c)==1){
                System.err.println(c);
                return;
            }
        }
    }
}
