public class reverseString_6  {
    public static void main(String[] args) {
        String str ="INTERVIEW";
//        char ch[]=str.toCharArray();
//        for (int i = ch.length-1; i>=0; i--) {
//            System.out.println(ch[i]);
//        }
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
