class bankAccount {
    int accountNo;
    String userName;
    String email;
    String accountType;
    int balance;

    public bankAccount(int accountNo, String userName, String email, String accountType, int balance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.balance = balance;
    }
    public void printAccount(){
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

public class lab64{
    public static void main(String[] args) {
        bankAccount B1 = new bankAccount(1234,"abc", "abc@example.com","saving",25000);
        B1.printAccount();
    }
}