import java.util.ArrayList;

public class SubarrayGenerator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        ArrayList<ArrayList<Integer>> subarrays = solve(arr);
        for(ArrayList<Integer> subarray : subarrays){
            System.out.println(subarray);
        }
    }
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> arr){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = arr.size();
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                ArrayList<Integer> v = new ArrayList<>();
                for(int k = i;k<=j;k++){
                    v.add(arr.get(k));
                }
                ans.add(v);
            }
        }
        return  ans;
    }
}