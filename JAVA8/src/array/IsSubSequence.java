package array;

public class IsSubSequence {
    public static void main(String[] args) {

        String s = "abc", t = "ahbgdc";

        //1. p1 p2
        int i =0;
        int j =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }

        }
        if(i<s.length()){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}
