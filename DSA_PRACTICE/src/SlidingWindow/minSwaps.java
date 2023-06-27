package SlidingWindow;

public class minSwaps {
    public static void main(String[] args) {
        int[] arr = {1,85,21,10,5,3,17,10};
        int B = 20;
        int ans = minswap(arr,B);
        System.out.println(ans);
    }
    public static int minswap(int[] arr,int B){
        int n = arr.length;
        int count = 0;
        for(int i = 0;i < n;i++){
            if(arr[i]<B){
                count++;
            }
        }
        int minswaps = 0;
        for(int i = 0;i < count;i++){
            if(arr[i]>B){
                minswaps++;
            }
        }
        int overAllMinSwaps=minswaps;
        int s = 1;
        int e = count;
        while(e<n){
            if(arr[s]>B){
                minswaps--;
            }
            if(arr[e]<B){
                minswaps++;
            }
            s++;e++;
            if(minswaps<overAllMinSwaps){
                overAllMinSwaps = minswaps;
            }
        }
        return overAllMinSwaps;
    }
}
