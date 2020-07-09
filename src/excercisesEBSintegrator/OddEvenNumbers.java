package excercisesEBSintegrator;

public class OddEvenNumbers {


    public static void main(String[] args) {


        int[] a = {2, 9, 3, 8, 4, 7, 5, 6, 10, 1};
        int sum = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if ((a[i] % 2) == 0) {
                count++;
            } else {
                sum = sum+a[i];
            }
        }
        System.out.println("Amount of even numbers is " + count);
        System.out.println("Sum of odd numbers is " + sum);
    }
}


