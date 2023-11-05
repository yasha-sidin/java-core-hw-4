package task1;

import task1.exceptions.AccessException;
import task1.exceptions.WrongLoginException;
import task1.exceptions.WrongPasswordException;

public class UserAccessChecker {
    public static boolean checkAccess(String login, String password, String confirmPassword) throws AccessException {
        if(login.length() > 20) throw new WrongLoginException("Length of login must be less than 20 characters.");
        if(password.length() > 20) {
            throw new WrongPasswordException("Password must be less than 20 characters.");
        }
        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong password.");
        }
        return true;
    }
}
