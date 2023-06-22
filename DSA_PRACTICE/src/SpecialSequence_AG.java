public class SpecialSequence_AG {
    public static void main(String[] args) {
        String str = "HARIKAGAAG";
        int result = findsequence(str);
        System.out.println(result);
    }
    public static int findsequence(String str){
        int ans = 0;
        int count = 0;
        int n = str.length();
        int modulo = (int)Math.pow(10,9)+7;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='A'){
                count++;
            }
            if(str.charAt(i)=='G'){
                ans=(ans+count)%modulo;
            }
        }
        return ans;
    }
}
