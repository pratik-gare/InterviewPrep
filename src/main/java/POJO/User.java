package POJO;

import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private int id;
    private String accountName;
    private String fullName;
    private UserStatus status = null;

    private HashMap<Integer, User> contacts;
    private HashMap<Integer, PrivateChat> privateChats = new HashMap<Integer, PrivateChat>();
    private ArrayList<GroupChat> groupChats = new ArrayList<GroupChat>();
    private HashMap<Integer, AddRequest> receivedAddRequest = new HashMap<Integer, AddRequest>();
    private HashMap<Integer, AddRequest> sentAddRequest = new HashMap<Integer, AddRequest>();

    public User(int id, String accountName, String fullName) {
        this.id = id;
        this.accountName = accountName;
        this.fullName = fullName;
    }

    
}
