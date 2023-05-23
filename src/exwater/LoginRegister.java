/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exwater;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sophia Madlentsy
 */
public class LoginRegister {

    private ArrayList<User> ListUser = new ArrayList<>();

    public LoginRegister(ArrayList<User> userList) {
        User u = new User();
        this.ListUser = userList;
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        //curUser variabel untuk memeriksa pilihan user saat login
        User curUser = null;
        int choose = 0;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("Your choice : ");
            choose = s.nextInt();
            if (choose == 1) {
                curUser = Login();
                System.out.println("==================================");
            } else {
                curUser = register();
                System.out.println("==================================");
            }
        } while (choose == 1 || choose == 2);
    }

    public User register() {
        User u = new User();
        Scanner s = new Scanner(System.in);
        System.out.println("========Please Register========");
        System.out.println("Username : ");
        String username = s.next() + s.nextLine();
        u.setUsername(username);
        System.out.println("Password : ");
        String pass = s.next() + s.nextLine();
        u.setPassword(pass);
        System.out.println("**********************************");
        System.out.println("Register have been successful");
        System.out.println("To main menu, you must login first");
        System.out.println("==================================");
        //menambahkan user baru saat melakukan register
        ListUser.add(u);
        return u;

    }

    public User Login() {
        User u = new User();
        Scanner s = new Scanner(System.in);
        System.out.println("========Please Login========");
        System.out.println("Username : ");
        String username = s.next() + s.nextLine();
        System.out.println("Password : ");
        String pass = s.next() + s.nextLine();

        if (ListUser.isEmpty()) {
            System.out.println("No users registered yet. Please register first.");
            return null;
        }

        //user dalam enhanced for loop itu merupakan variabel yang mewakili ListUser
        for (User user : ListUser) {
            if (user.getUsername().equals(username) && user.getPassword().equals(pass)) {
                System.out.println("**********************************");
                System.out.println("Login successful");
                System.out.println("==================================");
                return user;
            } else if (!user.getUsername().equals(username) || !user.getPassword().equals(pass)) {
                System.out.println("Username or password isn't match");
                System.out.println("==============OR================");
                System.out.println("Your username or password is wrong");
            }
        }
        return null;

    }

}
