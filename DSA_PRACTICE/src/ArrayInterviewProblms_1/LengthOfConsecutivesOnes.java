package ArrayInterviewProblms_1;

public class LengthOfConsecutivesOnes {
    public static void main(String[] args) {
        String str = "1010111";
        int ans = countones(str);
        System.out.println(ans);
    }
    public static int countones(String str){
        int n = str.length();
        int ones_count = 0;
        for(int i = 0;i<n;i++){
            if(str.charAt(i)=='1'){
                ones_count++;
            }
        }
        if(ones_count == n){
            return n;
        }
        if(ones_count == 0){
            return 0;
        }

        int my_ans = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0'){
                int l = 0;
                for(int j = i-1;j>=0;j--){
                    if(str.charAt(j)=='1'){
                        l++;
                    }else{
                        break;
                    }
                }

                int r = 0;
                for(int k = i+1;k<n;k++){
                    if(str.charAt(k)=='1'){
                        r++;
                    }
                    else{
                        break;
                    }
                }

                int my_count  = 0;
                if(ones_count>l+r){
                    my_count=l+r+1;
                }else{
                    my_count=l+r;
                }

                if(my_count>my_ans){
                   my_ans=my_count;
                }
            }
        }
        return my_ans;
    }
}
