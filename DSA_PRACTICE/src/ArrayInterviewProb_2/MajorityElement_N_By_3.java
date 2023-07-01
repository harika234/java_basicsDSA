package ArrayInterviewProb_2;

public class MajorityElement_N_By_3 {
    public static void main(String[] args){
        int[] arr = {1 ,2, 3, 1, 1};
        int op = count_majority(arr);
        System.out.println(op);
    }
    public static int count_majority(int[] A){
        int n = A.length;
        int first_elem = 0;
        int second_elem = 0;
        int first_count = 0;
        int second_count = 0;

        for(int i=0;i<n;i++){
            if(first_elem == A[i]){
                first_count++;
            }
            else if(second_elem == A[i]){
                second_count++;
            }
            else if(first_count == 0){
                first_elem = A[i];
                first_count++;
            }
            else if(second_count == 0){
                second_elem = A[i];
                second_count++;
            }

            else{
                first_count--;
                second_count--;
            }
        }

        first_count=0;
        second_count=0;

        for(int i = 0;i <n;i++){
            if(A[i] == first_elem){
                first_count++;
            }
            else if(A[i] == second_elem) {
                second_count++;
            }
        }
        if(first_count > Math.floor(n/3)){
            return first_elem;
        }
        if(second_count > Math.floor(n/3)){
            return second_elem;
        }
        return -1;
    }
}
