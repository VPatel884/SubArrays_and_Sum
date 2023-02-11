public class bruteForce {
    public static void BruteForce(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                    System.out.println("Sum of sub array is : "+sum);
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum of sub array is : "+ maxSum);
}
    
    public static void main(String args[]){
        int arr[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};

        BruteForce(arr);
    }
}
