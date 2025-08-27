import java.util.*;

public class Program_4 {

    public static void countNumebrList(int[] arr) {
        int[] map = new int[10];

        for(int i = 1; i <= 9; i++) {
            int count = 0;
            for(int num : arr) {
                if(num%i == 0) {
                    count++;
                }
            }
            map[i] = count;
        }

        System.out.print("{");
        for(int i = 1; i < 10; i++) {
            if(i != 9) {
                System.out.print(i+": "+map[i]+", ");
            } else {
                System.out.print(i+": "+map[i]);
            }
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the size of array: ");
            int size = sc.nextInt();
            int[] numbers = new int[size];

            for(int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            countNumebrList(numbers);

            // 1,2,8,9,12,46,76,82,15,20,30
        } catch (Exception e) {
            System.out.println("Something went wrong"+e);
        }

        sc.close();
    }
}