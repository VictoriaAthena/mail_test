package services;

import java.util.HashMap;
import java.util.List;

public abstract class MailDistributor implements MailService {
    private HashMap<String, List<Object>> receivers;
    public abstract void SaveUser();
    public void saveSingleUser(String type, Object user){
        receivers.get(type).add(user);
    }

    @Override
    public List<Object> getReceivers(String to) {
        return receivers.get(to);
    }
}
