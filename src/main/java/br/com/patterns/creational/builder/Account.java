package br.com.patterns.creational.builder;

public class Account {

    private Long id;
    private String username;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {

        private Long id;
        private String username;
        private String name;
        private String email;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Account build() {
            Account account = new Account();
            account.id = id;
            account.username = username;
            account.name = name;
            account.email = email;
            return account;
        }
    }
}
