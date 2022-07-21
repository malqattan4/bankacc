class BankAccount{
    //The class should have the following attributes: (double) checking balance, (double) savings balance.
    //Create a class member (static) that has the number of accounts created thus far.
    //Create a class member (static) that tracks the total amount of money stored in every account created.
    //In the constructor, be sure to increment the account count.
    public double checking_bal;
    public double savings_bal;
    public static int num_of_acc;
    public static int acc_amount;


    public BankAccount(){
        this.checking_bal=0;
        this.savings_bal=0;
        num_of_acc++;

    }


    //Create a getter method for the user's checking account balance.
    public double getCheckBal() {
        return checking_bal;
    }

    //Create a getter method for the user's saving account balance.
    public double getSavings() {
        return savings_bal;
    }

    //Create a method that will allow a user to deposit money into either the checking or saving, 
    //be sure to add to total amount stored.
    public void Deposit(int checking, double deposit){
        if (checking==1){
            this.checking_bal+= deposit;
            acc_amount+= deposit;
        }
        else if (checking ==2){
            this.savings_bal+= deposit;
            acc_amount+= deposit;
        }
    }



    //Create a method to withdraw money from one balance. 
    //Do not allow them to withdraw money if there are insufficient funds.
    public void Withdraw(int checking, double withdraw){
        if (checking==3){
            if (checking_bal>= withdraw){
            this.checking_bal-=withdraw;
            acc_amount-=withdraw;
        }
            else{
            System.out.println("Insufficient funds."); 
        }
        }

        else if (checking ==4){
            if (savings_bal>= withdraw){
            this.savings_bal-=withdraw;
            acc_amount-=withdraw;
        }
            else{
            System.out.println("Insufficient funds.");
        }
        }

    }


    //Create a method to see the total money from the checking and saving.
    public double Total(){
        double total = checking_bal+savings_bal;
        System.out.println("Total Account Balance is: " +total);
        return total;
    }


}
