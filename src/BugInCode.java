public class BugInCode {
    public static void main(String[] args) {
        System.out.println("The sum of the numbers in the array is: " +
                + calcSumArray(new int[]{7, 4, 2, 3, 4 }));
    }

    //given the code  below I believe the for loop is not summing the very first element in the array
    //checked it if I change some elements in the array
//    public static int calcSumArray(int[] arr){
//        int result =  0;
//        for (int i=1; i < arr.length; i++){
//            result += arr[i];
//        }
//        return result;
//    }
public static int calcSumArray(int[] arr) {
    int result = 0;
    for (int i = 0; i < arr.length; i++) { // This loop starts at index 0 to include the first element
        result += arr[i];
    }
    return result;
}

}


