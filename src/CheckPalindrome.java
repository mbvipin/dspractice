public class CheckPalindrome {


    public static void main(String[] args) {

        System.out.println(checkPalindrome("Malayalam"));
        System.out.println(checkPalindrome("Mala"));
        System.out.println(checkPalindrome("KAYAK"));

    }

    private static boolean checkPalindrome(String input)
    {
        if( input.length() <=1)

        {
            return true;
        }

        Character leftSideCharacter=Character.toLowerCase(input.charAt(0));
        Character rightSideCharacter= Character.toLowerCase(input.charAt(input.length()-1));

        if( leftSideCharacter== rightSideCharacter)
        {
            return checkPalindrome(input.substring(1,input.length()-1));
        }

        return false;
    }
}
