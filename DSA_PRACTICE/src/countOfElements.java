public class countOfElements {
    public static void main(String args[]){
        int[] arr = {5,5,3};
        int ans = countElements(arr);
        System.out.println(ans);
    }
    public static int countElements(int[] arr){
        int n = arr.length;
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int count = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==max){
                count++;
            }
        }
        return n-count;
    }
}
