public class Account {

    private int accountNO;
    private String name;
    private float amount;

    public void insert(int accountNO, String name, float amount) {
        this.accountNO = accountNO;
        this.name = name;
        this.amount = amount;
    }

    public void deposit(float amount) {
        this.amount += amount;
    }

    public void withdraw(float amount) {
        if (this.amount >= amount) {
            this.amount -= amount;
        } else {
            System.out.println("can not");
        }
    }

    public float checkBalance() {
        return amount;
    }

    public String toString() {
        return "ID Account = " + accountNO + ", Name = " + name + ", Amount = " + amount + " .";
    }

}
