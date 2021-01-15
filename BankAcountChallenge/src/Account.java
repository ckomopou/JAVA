public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    //------------------------------Constructor-----------------
    public Account(){
        this("344432", 8880, "Default Name", "Default email", "8999 768 887");
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone){
      this.accountNumber = accountNumber;
      this.accountBalance = accountBalance;
      this.customerName = customerName;
      this.customerEmail = customerEmail;
      this.customerPhone = customerPhone;
        System.out.println("Constructor with parameters was called" );
    }



    //--------------------------GETTERS-------------------
    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    //------------------------SETTERS----------------------------

    public void setAccountNumber(){
        this.accountNumber = accountNumber; // initialise the account number variable with the value of account number
    }

    public void setAccountBalance(double v){
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


    public void deposit(double depositAmount){
       this.accountBalance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.accountBalance );
    }

    public void withdrawal(double withdrawalAmount){
        if (accountBalance - withdrawalAmount >= 0 ){
            this.accountBalance -=withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "processed. Remaining balance " + this.accountBalance );
        }else{
            System.out.println("Insufficient funds. Withdrawal not processed!");
        }
    }
















}
