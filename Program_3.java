import java.util.*;

public class Program_3 {

    private static void helperMethod(int num) {
        int temp = 1;
        System.out.print("output: ");
        while (num > 0) {
            if(num == 1) {
                System.out.print(temp);
            } else {
                System.out.print(temp+", ");
            }
            temp += 2;
            num--;
        }
    }
    public static void printPattern(int num) {
        if(num%2 == 0) {
            helperMethod(num-1);
        } else {
            helperMethod(num);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please Enter integer number...");
            int num = sc.nextInt();
            printPattern(num);
        } catch (InputMismatchException e) {
            System.out.println("Please enter integer only!");
        } catch(Exception e) {
            System.out.println("Something went wrong");
        }

        sc.close();
    }
}