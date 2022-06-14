public class ReverseString {
    public static void main(String[] args) {
        String word = "Codytex";
        String reverse = "";
        String anotherWay = "";
        char [] array=word.toCharArray();
        for (int i = array.length-1; i>0; i++) {
            anotherWay += array[i];
        }

        for (int i = word.length()-1; i>=0 ; i--) {
            reverse=reverse+word.charAt(i);
            System.out.println(reverse);

        }
        StringBuffer not = new StringBuffer(word);
        StringBuilder build = new StringBuilder(word);

        System.out.println(not.reverse());
        System.out.println(build.reverse());
    }
}

