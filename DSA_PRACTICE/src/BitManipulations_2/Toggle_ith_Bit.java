package BitManipulations_2;

public class Toggle_ith_Bit {
    public static void main(String args[]){
        int A = 4;
        int B = 1;

        int op = toggleBit(A,B);
        System.out.println(op);
    }
    public static int toggleBit(int A,int B){
        return A^1<<B;
    }
}
