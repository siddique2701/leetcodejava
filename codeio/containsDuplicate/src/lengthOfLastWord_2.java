public class lengthOfLastWord_2 {

    public static void main(String[] args) {
        String s = "Hello world";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }
    public static int lengthOfLastWord(String s) {
        s = s.stripTrailing();
        int length =0;
        for (int i =s.length() -1; i>=0; i--) {
            if (s.charAt(i) == ' ')
                return length;
            length++;
        }
        return length;
    }
}
