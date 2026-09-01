import java.util.Scanner;
import java.util.Stack;

class bal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}