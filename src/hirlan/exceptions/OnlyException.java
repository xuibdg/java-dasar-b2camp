package hirlan.exceptions;

import hirlan.oop.Account;

public class OnlyException {

    public static void login(String username, String password)
            throws Account {
        if (!username.equals("admin") || !password.equals("1234")) {
            throw new Account("Username/password salah!");
        }
        System.out.println("Login berhasil");
    }

    public static void main(String[] args) {
        try {
            login("user", "0000");
        } catch (Account e) {
            System.out.println("Error login: " + e.getMessage());
        }finally {
            System.out.println("apa aja boleh ceng!!!");
        }
    }
}
