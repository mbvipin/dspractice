public class BinarySearch {

    public static void main(String[] args) {

        int [] input =new int [] {1,2,3,4,5,6,7,8,9,10};

        System.out.println(doBinarySearch(input,0,input.length-1, 10));
    }

    private static int doBinarySearch(int[] input,int start,int end,int target) {

        if( start < end) {

            int mid = (start + end) / 2;

            if (input[mid] == target) {
                return mid;
            }

            if(input[mid] < target)
            {
                return doBinarySearch(input,mid+1,end,target);
            }

            return doBinarySearch(input,start,mid-1,target);


        }


        return -1;

    }
}
