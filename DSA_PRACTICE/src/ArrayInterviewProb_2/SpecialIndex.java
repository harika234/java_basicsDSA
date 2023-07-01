package ArrayInterviewProb_2;
public class SpecialIndex {
    public static void main(String[] args){
        int[] arr = {2, 1, 6, 4};
        int op = countSpecielindex(arr);
        System.out.println("Total number of special indexes are : "+op);
    }
    public static int countSpecielindex(int[] arr){
        int n = arr.length;
        int[] pfe = new int[n];
        pfe[0] = arr[0];
        for(int i = 1; i< n;i++){
            if(i%2 == 0){
                pfe[i] = pfe[i-1] + arr[i];
            }
            else{
                pfe[i] = pfe[i-1];
            }
        }
        int[] pfo = new int[n];
        pfo[0] = 0;
        for(int i = 1;i<n;i++){
            if(i%2!=0){
                pfo[i] = pfo[i-1]+arr[i];
            }
            else{
                pfo[i] = pfo[i-1];
            }
        }
        int count = 0;
        for (int i=0;i<n;i++){
            int se = 0;
            int so = 0;
            if(i!=0) {
                se = pfe[i - 1] + pfo[n - 1] - pfo[i];
                so = pfo[i - 1] + pfe[n - 1] - pfe[i];
            }
            else{
                se = pfe[n-1];
                so = pfo[n-1];
            }
            if(se == so){
                count++;
            }
        }
        return count;
    }
}
