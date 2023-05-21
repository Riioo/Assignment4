package Assignment4;

public class Q7 {
    public static boolean hasUniqueCharacters(String str) {
        boolean[] charSeen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charSeen[c]) {
                return false;
            }
            charSeen[c] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "Hello";
        boolean result = hasUniqueCharacters(input);
        System.out.println(result);
    }
}
