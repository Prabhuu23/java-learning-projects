import java.util.Scanner;

public class method {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter your Age:");
        int age =scanner.nextInt();

        if(checkage(age)){
            System.out.println("you can signup");
        }
        else{
            System.out.println("you must be 18+");
        }

    }

    static boolean checkage(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
