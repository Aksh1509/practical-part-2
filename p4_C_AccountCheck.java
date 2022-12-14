// this is the supportive class file for the pr2_B

// Name : AKSH_SURANI
// ID : 21CE140
// Div: CE2 C2

// Aim :
// (Subclasses  of  Account)  In  Programming  Exercise  2,  the  Account  class  wasdefined to model a bank account. An account has the properties account number,balance,  annual  interestrate,  and  date  created,  and  methods  to  deposit  and withdrawfunds.  Create  two  subclasses  for  checking  and  saving  accounts.  A checkingaccount  has  an  overdraft  limit,  but  a  savings  account  cannot  be overdrawn.Draw  the  UML  diagram  for  the  classes  and  then implement  them. Writea  test  program  that  creates  objects  of  Account,  SavingsAccount,  andCheckingAccount and invokes their toString() methods.
public class p4_C_AccountCheck extends p2_A_Account {
    // Checking Account supports the overdraft
    // Let withdraw limit be 9000 Rs.
    // Let overdraft charge be 5%
    double od = 5000;
    double odc = 0.05;

    public p4_C_AccountCheck() {
    }
    public p4_C_AccountCheck(int id, double balance) {
        super(id, balance);
    }

    //overriding withdraw() method.
    public void withdraw(double money) {
        // condition for over drafting money
        if (getblnc() - money < -od) {
            super.withdraw(money); // parent class method to withdraw amount.
            setblnc(getblnc()-money*odc);
            System.out.println(money*odc+"Rs. charge is deducted from your account.");
        } else {
            System.out.println("Can't overdraft money more than " + od + " Rs.");
        }
    }
}