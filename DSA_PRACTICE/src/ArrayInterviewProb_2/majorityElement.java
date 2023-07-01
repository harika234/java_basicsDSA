package ArrayInterviewProb_2;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1,2,0};
        int op = count_ME(arr);
        System.out.println(op);
    }

    public static int count_ME(int[] arr){
        int n = arr.length;
        int majority_Element = arr[0];
        int count = 1;

        for(int i =1;i<n;i++){
            if(arr[i] == majority_Element){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                majority_Element = arr[i];
            }
        }

        int count_majority_element = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==majority_Element){
                count_majority_element++;
            }
            if(count_majority_element>n/2){
                return majority_Element;
            }
        }
        return  -1;
    }
}
