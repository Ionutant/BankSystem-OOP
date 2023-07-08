public class User {

    private Bank bank;

    int id;
    String name;
    String Address;
    String Phone;
    int AccNo;

    public User(int id, String name, String address, String phone, int accNo) {
        this.id = id;
        this.name = name;
        this.Address = address;
        this.Phone = phone;
        this.AccNo = accNo;
        this.bank = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getAccNo() {
        return AccNo;
    }

    public void setAccNo(int accNo) {
        AccNo = accNo;
    }

    public void setBank(Bank bank){
        this.bank = bank;
    }

    public String getBank() {
        if(bank != null){
            return bank.getName()+" "+bank.getLocation();
        }
        else return "No bank";
    }
}
