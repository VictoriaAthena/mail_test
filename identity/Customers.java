package identity;

import services.MailDistributor;
import services.MailService;

import java.util.List;

public class Customers extends MailDistributor {

    private String type = "Customers";
    private String name;
    private String email;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void SaveUser() {
        saveSingleUser(type,email);
    }

}
