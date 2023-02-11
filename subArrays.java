public class subArrays {

    public static void subArray(int arr[]){
        int totalSubArray = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+" ");
                    
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total numbers of sub arrays are : "+totalSubArray);
    }

    public static void main(String args[]){
        int arr[] = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
        subArray(arr);
    }
}