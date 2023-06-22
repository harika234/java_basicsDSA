public class printAllSubSequence {
    public static void main(String args[]){
        int[] arr = {1,2,3};
        System.out.println("subsequences of array:");
        printSubSequnce(arr,0,"");
    }

    public static void printSubSequnce(int[] arr,int index,String subsequence) {
        if(index >= arr.length){
            System.out.println(subsequence);
            return;
        }

        // Recursive case: include the element at the current index
        printSubSequnce(arr,index+1,subsequence+arr[index]+" ");

        // Recursive case: exclude the element at the current index
        printSubSequnce(arr,index+1,subsequence);

        // Recursive case: include the empty subsequence
//        printSubSequnce(arr,index+1,subsequence+"@space@");
    }
}
