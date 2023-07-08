

public class Account {

    int Id;
    int UserId;
    double balance;

    public Account(int id, int userId, double balance) {
        Id = id;
        UserId = userId;
        this.balance = balance;
    }

    public Account() {

    }

    void Deposit(double amount){
        balance = balance + amount;
        System.out.println("Your balance is:" +balance);
    }

    void Withdraw(double amount){
        balance = balance - amount;
        System.out.println("Your balance is:" +balance);
    }
}

 class Checking extends Account{
    int Id;
    int UserId;

    public Checking(){
        super();

    }

    void ShowCh(){
        System.out.println(Id +UserId + balance);
    };

}

 class Saving extends Account{
    int Id;
    int UserId;

    public Saving(){
        super();

    }

    void ShowSav(){
        System.out.println(Id + UserId + balance);
    }

 }
