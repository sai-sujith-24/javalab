import java.util.Scanner;

class ant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine().toLowerCase();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            boolean checked = false;

            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    checked = true;
                    break;
                }
            }

            if (!checked) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        System.out.println("Duplicate = " + words[i]);
                        break;
                    }
                }
            }
        }
    }
}