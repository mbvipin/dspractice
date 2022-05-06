public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        System.out.println(calculateSumOfNNaturalNumbers(10));
        System.out.println(calculateSumOfNNaturalNumbers(-1));
        System.out.println(calculateSumOfNNaturalNumbers(5));
    }

    private static int calculateSumOfNNaturalNumbers(int n) {

        if( n <1)
        {
            System.out.println("Invalid Input");
            return 0;
        }

        // Base Case
        if( n==1)
        {
            return 1;
        }

        return n+calculateSumOfNNaturalNumbers(n-1);

    }
}
