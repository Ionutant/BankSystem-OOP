import java.util.ArrayList;
import java.util.List;

public class Bank {
    int BankId;
    String name;
    String location;
    private List<User> users;

    public Bank(int bankId,String name, String location){
        this.BankId = bankId;
        this.name = name;
        this.location = location;
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
        user.setBank(this);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
