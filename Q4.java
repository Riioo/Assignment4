package Assignment4;

public class Q4 {
    public static void countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int specialChars = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialChars++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        countCharacters(input);
    }
}
