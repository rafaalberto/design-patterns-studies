package br.com.patterns.creational.singleton;

public class Login {

    private static Login instance = null;
    private String user;

    private Login() {
    }

    public static Login getInstance() {
        if (instance == null) {
            return instance = new Login();
        }
        return instance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
