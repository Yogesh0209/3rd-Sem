import java.util.Scanner;
public class marks {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks :");
        marks = scanner.nextInt();

        if(marks>=0 && marks<25){
            System.out.println("Sorry, You are failed");   
        }
        else if(marks>=25 && marks<50){
            System.out.println("You are third");   
        }
        else if(marks>=50 && marks<75){
            System.out.println("You are second");   
        }
        else if(marks>=75 && marks<=100){
            System.out.println("First");   
        }
        else if(marks<0 || marks>100){
            System.out.println("Error");   
        }
        scanner.close();
    }
}
