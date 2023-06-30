package ArrayInterviewProblms_1;

public class josephousProblem {
    public static void main(String[] args) {
        int A = 100;
        int res = josProb(A);
        System.out.println(res);
    }

    public static int josProb(int A){
        int res = 0;
        for(int i=1;i<=A;i++){
            res = (res+2)%i;
        }
        return res+1;
    }
}
