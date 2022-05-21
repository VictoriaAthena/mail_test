package services;

import java.util.HashMap;
import java.util.List;

public interface MailService {
    List<Object> getReceivers(String to);
}
