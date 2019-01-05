package POJO;

public class UserStatus {
    private String message;
    private UserStatusType type;

    public UserStatus(UserStatusType type, String message) {
        this.message = message;
        this.type = type;
    }

    public String getMessage() {
        return this.message;
    }

    public UserStatusType getStatusType() {
        return this.type;
    }
}
