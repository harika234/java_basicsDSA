package BitManipulations_1;

public class DecimalToAnyBase {
    public static void main(String args[]){
        int a = 4;
        int b = 2;

        int ans = 0;
        int pow = 1;
        while(a>0){
            int digit = a%b;
            ans = ans+digit*pow;
            a=a/b;
            pow = pow * 10;

        }
        System.out.println(ans);
    }
}
