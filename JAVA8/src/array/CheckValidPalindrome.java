package array;

public class CheckValidPalindrome {
    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

       int left = 0, right = s.length() - 1;
       while (left < right) {
           if (s.charAt(left) != s.charAt(right)) {
               System.out.println(false);
               return;
           }
           left++;
           right--;
       }
       System.out.println(s);

    }
}
