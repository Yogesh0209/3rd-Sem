import java.util.Scanner;
public class evenodd{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the number :");
        num = scanner.nextInt();
        if (num%2==0) {
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        scanner.close();
    }
}