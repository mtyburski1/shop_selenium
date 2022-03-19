package models;

public class User {
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;


    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static final class Builder {
        private String login;
        private String password;
        private String email;
        private String firstName;
        private String lastName;

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public User build() {

            User user = new User();
            user.login = this.login;
            user.password = this.password;
            user.email = this.email;
            user.firstName = this.firstName;
            user.lastName = this.lastName;
            return user;
        }
    }
}
