import java.util.*;
class Bank{
    String name;
    String acctype;
    int acno;
    
    Scanner sc = new Scanner(System.in);
    void getdata(){
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter the Account Type");
        acctype=sc.next();
        System.out.println("Enter Account number: ");
        acno=sc.nextInt();
    }
    
    void display() {
        System.out.println(name+" "+acctype+" "+acno);
    }
}
class CurrentAccount extends Bank{
    double balance;
    void deposit1(){
        double deposit;
        System.out.println("enter Balance");
        balance=sc.nextDouble();
        System.out.println("Enter Deposit amount");
        deposit=sc.nextDouble();
        balance=balance+deposit;
        System.out.println("Total balance:"+balance);
    }
    void withdraw(){
        double withdraw_amount;
        System.out.println("Enter withdraw");
        withdraw_amount = sc.nextDouble();
        if(withdraw_amount>balance){
            System.out.println("Balance is not sufficient");
        }
        else{
            balance = balance-withdraw_amount;
            System.out.println("Remaining:"+balance);
        }
    }
}
class BankInheritance{
    public static void main(String args[]){
        CurrentAccount ca= new CurrentAccount();
        ca.getdata();
        ca.display();
        ca.deposit1();
        ca.withdraw();
    }
}