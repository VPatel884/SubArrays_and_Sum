public class prefixSum {
    public static void PrefixSum(int arr[]){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

                if(sum > maxSum){
                    maxSum = sum;
            }
            }
        }
        System.out.println("Maximum sum of sub array is : "+maxSum);
    }
    public static void main(String args[]){
        int arr[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};

        PrefixSum(arr);
    }
}
