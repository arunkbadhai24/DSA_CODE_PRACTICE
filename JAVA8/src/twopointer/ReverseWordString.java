package twopointer;

public class ReverseWordString {
    public static void main(String[] args) {
        String s1="the sky is blue";
        System.out.println(reverseWords(s1));


    }

   static String reverseWords(String s) {

        //Story
        //1. revrse whole string
       String reverseString = reverse(s);

       //2. reverse each word
        int n = reverseString.length();
        int i = 0;
        int l = 0;
        int r = 0;

        while (i < n) {

            while (i < n && reverseString.charAt(i) == ' ') {

            }
        }

       return "";
   }

    private static String reverse(String s) {
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {

            // extracts each character
            ch = s.charAt(i);

            // adds each character in
            // front of the existing string
            r = ch + r;
        }

        return r;
    }

}
