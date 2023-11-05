package task1;

import task1.exceptions.WrongLoginException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoginApp {
    public static void startApp() {
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Login: ");
            String login = bf.readLine();
            System.out.print("Password: ");
            String password = bf.readLine();
            System.out.print("Confirm password: ");
            String confirmPassword = bf.readLine();
            if(UserAccessChecker.checkAccess(login, password, confirmPassword)) System.out.println("Successful!");;
        } catch (Exception e) {
            System.out.println(e.getClass() + ": " + e.getMessage());
        }
    }
}
