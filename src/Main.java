import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Bank BT = new Bank(1,"BT","Brasov");
        Bank bcr = new Bank(2,"BCR","Buzau");
        User user1 = new User(1,"Coman Mihai", "Brasov", "076988988",3);
        User user12 = new User(2,"Borcea Mihai", "Bucuresti", "073945988",4);

        BT.addUser(user1);
        bcr.addUser(user12);

        System.out.println(user1.getName() +" from "+ user1.Address + "is client of Bank:" +user1.getBank());


        System.out.println("Introduce the balance:");
        Scanner sc =new Scanner(System.in);
        String x = sc.nextLine();
        double sum = Double.parseDouble(x);

         Account acc1= new Account(1,1,sum);
        System.out.println("You make a deposit and now");
         acc1.Deposit(300);
        System.out.println("You make a withdraw and now");
         acc1.Withdraw(600);


        Teller.OpenAccount();

        Teller.CloseAccount(3);
    }
}
