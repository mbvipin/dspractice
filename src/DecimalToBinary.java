public class DecimalToBinary {

    public static void main(String[] args) {

        System.out.println(decimalToBinary(8));
        System.out.println(decimalToBinary(16));
        System.out.println(decimalToBinary(32));
    }

    private static String  decimalToBinary(int decimal) {

        String result="";
        if( decimal==0)
        {
            return "0";
        }

        result= (decimal %2 )+ result;

        return decimalToBinary(decimal/2)+result;
    }
}
