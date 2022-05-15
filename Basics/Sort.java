// Design a Java code to receive input for ‘n’ numbers and sort numbers based on user’s choice either ascending or descending.
// Finally print results
 import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);

        System.out.println("Enter number of elements you want to sort: ");
        n=s.nextInt();

        Integer[] nums = new Integer[n];
//        System.out.println(nums.length);
        System.out.println("Enter numbers: ");
        for(int i=0; i<n; i++){
            nums[i]= s.nextInt();
        }

        System.out.println("Enter sorting choice ascending or descending as a or d: ");
        char choice;
        choice= s.next().charAt(0);
//
//        if (choice=='a'){
//            Arrays.sort(nums);
//            for (int e: nums)
//                System.out.print(e+" ");
//            System.out.println();
//        }
//        else if (choice=='d'){
////          sorting in reverse with collection class:
////            Arrays.sort(nums, Collections.reverseOrder());
//
////            Arrays.sort() cannot be used directly to sort primitive arrays in descending order. If we try to call the Arrays.
////            sort() method by passing reverse Comparator defined by Collections.reverseOrder(), it will throw the error as shown below as follows:
////            Tip: But this will work fine with ‘Array of Objects’ such as the Integer array but will not work with a primitive array such as the int array.
//
////            for (int e: nums)
////                System.out.print(e+" ");
//            Arrays.sort(nums);
//            for(int i=n-1; i>=0; i--)
//                System.out.print(nums[i]+" ");
//        }
//        else{
//            System.out.println(choice+" is not a valid choice!");
//        }
        System.out.println();
        numSort(nums, choice);  // sorting without predefined methods
    }

    // created sorting method
    static void numSort(Integer[] nums, char order){
        int tmp=0;
        for(int i = 0;  i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
//        System.out.println(Arrays.toString(nums));
        if (order=='a') {
            for (int i : nums) {
                System.out.print(i+" ");
            }
        }
        else if (order=='d') {
            for(int i=nums.length-1; i>=0; i--)
                System.out.print(nums[i]+" ");
        }
        else{
            System.out.println(order+" is not a valid choice!");
        }
        }
}
