package Assignment4;

public class Q8 {
    public static char getMaxOccurringCharacter(String str) {
        int[] charCount = new int[256];

        for (char ch : str.toCharArray()) {
            charCount[ch]++;
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > maxCount) {
                maxChar = (char) i;
                maxCount = charCount[i];
            }
        }

        return maxChar;
    }

    public static void main(String[] args) {
        String input = "Hello World";
        char result = getMaxOccurringCharacter(input);
        System.out.println(result);
    }
}

