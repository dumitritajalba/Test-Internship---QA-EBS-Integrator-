package excercisesEBSintegrator;

public class Palindrome {
    static boolean palindrome(String word) {
        int a = 0;
        int b = word.length() - 1;

        while (a < b) {
            if (word.charAt(a) != word.charAt(b))
                return false;
            a++;
            b--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "natan";

        if (palindrome(word)) {
            System.out.println("yep, it is!");
        } else {
            System.out.println("Sorry, it's not!");
        }
    }
}