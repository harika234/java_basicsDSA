package BitManipulations_1;

public class AnyBaseToDecimal {
    public static void main(String args[]){
        int A = 1010;
        int B = 2;

        int op = baseTodecimal(A,B);
        System.out.println(op);
    }
    public static int baseTodecimal(int A,int B){
        int ans = 0;
        int pow = 1;
        while(A>0){
            int digit = A%10;
            ans = ans+(digit)*pow;
            A=A/10;
            pow = pow * B;
        }
        return ans;
    }

}
