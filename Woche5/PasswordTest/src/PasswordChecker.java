public class PasswordChecker {
    private String password = "geheim";

    public boolean check(String pwdToCheck) {
        if(password.equals(pwdToCheck)) {
            return true;
        } else {
            return false;
        }
    }
}
