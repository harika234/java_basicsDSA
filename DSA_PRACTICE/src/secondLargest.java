public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,9,7,10};
        int n = findsecondlargest(arr);
        System.out.println(n);
    }
    public static int findsecondlargest(int[] arr){
        int firstlargest  = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstlargest){
                firstlargest = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondlargest && arr[i]<firstlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}
