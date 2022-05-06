public class ReverseAString {

    public static void main(String[] args) {

        System.out.println(doReverseString("hello"));
    }

    private static String doReverseString(String input) {

        if( input.length() <1)
        {
            return input;
        }

        return doReverseString(input.substring(1))+input.charAt(0);
    }
}
