import java.util.Scanner;

public class vowelsAndconsonents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String check = in.next();
        check = check.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < check.length(); i++) {
            char ch = check.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
    }
}
