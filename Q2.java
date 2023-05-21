package Assignment4;

public class Q2 {
    public static void printDuplicates(String str) {
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i);
            }
        }
    }

    public static void main(String[] args) {
        String input = "Hello World";
        printDuplicates(input);
    }
}
