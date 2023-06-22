public class Recursion {
    public static void main(String args[]){
        int n = 5;
        int result = prod(n);
        System.out.println("product of first "+n+" numbers is"+ " = "+result);
    }
    public static int prod(int n){

        if(n==1){
            return 1;
        }
        return n*prod(n-1);
    }
}
