package Main_Program.Login_and_Register;


import Main_Program.Main.Main;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Authentication {
    /*1. set method register() */
    public void register() throws FileNotFoundException {
        /*1. deklarasi varible*/
        String userName;
        String passWord;
        String confPass;

        /*2. set instansiasi kelas Scanner*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username : ");
        userName = input.nextLine();
        System.out.println(userName);

        System.out.print("Enter Password : ");
        passWord = input.nextLine();
        System.out.println(passWord);

        System.out.println("Confirm Password");
        confPass = input.nextLine();
        System.out.println(confPass);
        userName = userName.trim();
        passWord = passWord.trim();
        confPass = confPass.trim();

        String x = userName+ " " + passWord;
        if (passWord.equals(confPass)) {
            /*instansiasi kelas File dengan mengirimkan file data.txt*/
            File f = new File("data.txt");
            Scanner content = new Scanner(f);

            int flag = 0;
            while(content.hasNextLine()) {
                String data = content.nextLine();
                if (data.equals(x)) {
                    System.out.println("Already Registered");
                    flag = 1;
                    System.out.println("1. Registration");
                    System.out.println("2. Login");

                    System.out.print("Enter your choice : ");
                    int choice = input.nextInt();
                    if (choice == 1) {
                        this.register();
                    } else if (choice == 2) {
                        this.login();
                    } else {
                        System.out.println("Choose proper option please");
                    }
                    break;
                }
                //content.close();
            }
            if (flag == 0) {
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter("data.txt", true));
                    out.write(userName+" "+passWord+"\n");
                    out.close();
                } catch (IOException error) {
                    System.out.println("Exception occured "+ error);
                }
                System.out.println("Successfully Registered");
                System.out.println("Please Login");
                this.login();
            }
        } else {
            System.out.println("Recheck");
            System.out.println("1. Registration.");
            System.out.println("2. Login");

            System.out.println("Enter your choice : ");
            int choice = input.nextInt();
            if (choice == 1) {
                this.register();
            } else if (choice == 2) {
                this.login();
            } else {
                System.out.println("Choose proper Option..");
            }
        }
        //input.close();
    }

    /*create method login()*/
    public void login() {
        /*instansiasi kelas Scanner*/
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username   : ");
        String userName = input.nextLine();
        System.out.println(userName);

        System.out.println("Enter password :");
        String passWord = input.nextLine();
        System.out.println(passWord);
        userName = userName.trim();
        passWord = passWord.trim();
        String x = userName+" "+passWord;

        try {
            File f = new File("data.txt");
            Scanner content = new Scanner(f);
            //inisialisasi variabel flag sebesar = 0
            int flag = 0;
            while(content.hasNextLine()) {
                String data = content.nextLine();
                /*cek apakah data sesuai dengan yang diinput*/
                if (data.equals(x)) {
                    System.out.println("|| ========================== ||");
                    System.out.println("|| Login Successfully         ||");
                    System.out.println("|| welcome to the application ||");
                    System.out.println("|| ========================== ||");

                    //instansiasi kelas Main
                     Main main = new Main();
                     main.displayMain();

                    //re-assign variable flag
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Login Failed...");
                System.out.println("1. Registration.");
                System.out.println("2. Login.");

                System.out.println("Enter your choice : ");
                int choice = input.nextInt();
                if (choice == 1) {
                    this.register();
                } else if (choice == 2) {
                    this.login();
                } else {
                    System.out.println("Choose proper option.");
                }
            }
            //content.close();
        } catch (FileNotFoundException error) {
            System.out.println("Error.");
            error.printStackTrace();
        }
        //input.close();
    }

}

