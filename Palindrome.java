public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String word = args[i];  
            boolean temp = isPalindrome(word);
            System.out.println(temp);
        }

    }

    public static String reverseString(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }

    public static boolean isPalindrome(String str) {
        String s2 = reverseString(str);
        return s2.equals(str);
    }
}