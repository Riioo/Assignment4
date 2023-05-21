package Assignment4;


public class Q1 {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] charSeen = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!charSeen[c]) {
                sb.append(c);
                charSeen[c] = true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World";
        String result = removeDuplicates(input);
        System.out.println(result);
    }
}
