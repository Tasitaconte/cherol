package Modelos;

public class UserModel {

    private int id_user;
    private String name_user, email_user, pass_user;

    public UserModel() {
    }

    public UserModel(String name_user, String email_user, String pass_user) {

        this.name_user = name_user;
        this.email_user = email_user;
        this.pass_user = pass_user;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }

    public String getPass_user() {
        return pass_user;
    }

    public void setPass_user(String pass_user) {
        this.pass_user = pass_user;
    }

}
