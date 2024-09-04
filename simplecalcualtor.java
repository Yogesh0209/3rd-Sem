import java.util.Scanner;
public class simplecalcualtor {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int result;

        System.out.println("Enter the value of num1 :");
        int num1 = scanner.nextInt();
        System.out.println("Enter the value of num2 :");
        int num2 = scanner.nextInt();
        System.out.println("Enter the operation you want to perform {'add','sub','mul','div'} :");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1 :
            result = num1 + num2;
            System.out.println("The sum of two numbers is :" +result);
            break;
            
            case 2 :
            result = num1 - num2;
            System.out.println("The subtration of two numbers is :" +result);
            break;

            case 3 :
            result = num1 * num2;
            System.out.println("The multiplication of two numbers is :" +result);
            break;

            case 4 :
            result = num1 / num2;
            System.out.println("The division of two numbers is :" +result); 
            break;
        
            default:
            System.out.println("Wrong operation!");
                break;
        }
        scanner.close();

    }
}
