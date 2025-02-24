package twopointer;

public class ReverseVowelOfString {

    static String vowels = "aeiouAEIOU";
    public static void main(String[] args) {
       // reverseVowels("hello");
       // s="hellm";
        System.out.println(String.valueOf(vowels.toCharArray()));
        if(!true){
            System.out.println("1");
        }else if (!true){
            System.out.println("2");
        }else{
            System.out.println("3");
        }
    }


    public static String reverseVowels(String s) {

        int i =0;
        int j = s.length()-1;

       while(i<j){
            if (vowels.contains(String.valueOf(s.charAt(i)))
                    && vowels.contains(String.valueOf(s.charAt(j)))){

                char temp = s.charAt(i);
                s = s.replace(s.charAt(i),s.charAt(j));
                s = s.replace(s.charAt(j),temp);

                i++;
                j--;
            }else if(vowels.contains(String.valueOf(s.charAt(i)))){

                i++;
            }else {

            }
        }


        return null;
    }
}
