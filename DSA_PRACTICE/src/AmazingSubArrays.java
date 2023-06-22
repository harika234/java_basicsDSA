import java.util.Scanner;

public class AmazingSubArrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your name");
        String str = scn.next();
        int n = findsubarrays(str);
        System.out.println(n);
    }
    public static int findsubarrays(String str){
        int n = str.length();
        int count = 0;
        for(int i =0;i<n;i++){
            char ch = str.charAt(i);
            if(ch =='A'|| ch=='E'|| ch=='O' || ch=='I' || ch == 'U'
                    || ch =='a'|| ch =='e'|| ch =='i' || ch =='o'|| ch =='u')
            {
                count = (count+(n-i))%10003;
            }
        }
        return count;
    }
}
