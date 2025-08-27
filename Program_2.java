import java.util.*;

public class Program_2 {

    static void printPattern(int num) {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your integer number...");
            int num = sc.nextInt();
            printPattern(num);
        } catch (InputMismatchException e) {
            System.out.println("please enter integer number");
        } catch(Exception e) {
            System.out.println("something went wrong");
        }
        sc.close(); 
    }
}