public class validPalindrome_11 {
    public static void main(String[] args) {

    }
}
    public static boolean isPalindrome(String s ) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", " ")
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return true;


    }
}


