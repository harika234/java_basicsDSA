package BitManipulations_1;

public class SingleNumber {
    public static void main(String args[]){
        int[] a = {1,0,1,2,2};
        int ans = 0;
        for(int i=0;i<a.length;i++){
            ans = ans^a[i];
        }
        System.out.println(ans);
    }
}
