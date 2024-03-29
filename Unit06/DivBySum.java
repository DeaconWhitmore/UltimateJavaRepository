package Unit06;

public class DivBySum {
    public static int divBySum(int[] arr, int num) {
        int total = 0;

        // regular (indexed) for loop
        // for (int i = 0; i < arr.length; i++){
        //     if(arr[i] % num == 0){
        //         total += num;
        //     }
        // }

        // enhanced for loop
        for(int n : arr){
            if(n % num == 0){
                System.out.print(n);
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        System.out.println(divBySum(new int[] {4, 1, 3, 6, 2, 9}, 2));
    }
}