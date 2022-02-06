package day04;

public class PairFinder {

    public int findPairs(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = 1;
            //System.out.println("outer iteration: " + i + " tempval: " + temp);
            for (int j = i + 1; j < arr.length; j++ ) {
                //System.out.println("inner iteration: " + j + " tempval: " + temp);
                //System.out.println("arr i: " + arr[i] + "; arr j: " + arr[j]);
                //System.out.println(arr[i] == arr[j]);
                if (arr[i] == arr[j]) {
                    temp += 1;
                    if (temp % 2 == 0) {
                        result += 1;
                    }
                    //System.out.println("temp increased: " + temp);
                }
            }
            //result += temp /2;
        }
        return result;
    }

    public static void main(String[] args) {
        PairFinder pf = new PairFinder();
        //int[] arr = new int[]{7, 1, 5, 7, 3, 3, 5, 7, 6, 7, 5, 7};
        int[] arr = new int[]{3, 3, 4, 3};
        int result = pf.findPairs(arr);
        System.out.println(result);
    }
}
