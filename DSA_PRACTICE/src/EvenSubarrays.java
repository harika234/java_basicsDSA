public class EvenSubarrays {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 6};
        int n = arr.length;
        if(arr[0]%2==0 && arr[n-1]%2==0 && n%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
