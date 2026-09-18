import java.util.Scanner;

class nag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (!alreadyChecked) {
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j))
                        count++;
                }

                if (count > 1)
                    System.out.println(str.charAt(i) + " = " + count);
            }
        }
    }
}