package sample;

/**
 * Created by Viscus on 10/18/16.
 */
public class Contacts {
    String name;
    String phone;
    String email;

    public Contacts(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
