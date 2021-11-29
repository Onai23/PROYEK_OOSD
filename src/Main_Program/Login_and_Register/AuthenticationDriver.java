package Main_Program.Login_and_Register;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AuthenticationDriver {
    /*1. set main method*/
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File obj = new File("data.txt");
            if (obj.createNewFile()) {
                System.out.println("=====================");
                System.out.println("|| File is created || ");
                System.out.println("=====================");
            }
        } catch (IOException error) {
            System.out.println("An error occured" );
            error.printStackTrace();
        }
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Registration. ");
        System.out.println("2. Login");

        System.out.println("Enter your choice : ");
        choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            Authentication authentication = new Authentication();
            authentication.register();
        } else if (choice == 2) {
            Authentication authentication = new Authentication();
            authentication.login();
        }
        input.close();
    }
}
