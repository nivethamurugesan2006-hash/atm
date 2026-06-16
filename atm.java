import java.util.Scanner;
 class ATM{
     static int Currentamount=12000;

    public void Deposit(int Useramount){
        int totalamount=Currentamount+Useramount;
        
        System.out.println("totalamount :"+totalamount);
        Currentamount=totalamount;
        
    }
    public void Withdraw(int Useramount){
        int debit=Currentamount-Useramount;
        Currentamount=debit;
        System.out.println("Youramount"+debit);
        
    }
    public void Checkbalance(){
        System.out.println("balance :"+Currentamount);
        
        
    }
 }
public class Main{
	public static void main(String[] args) {
		
		ATM a=new ATM();
		a.Deposit(10000);
		a.Deposit(500);
		a.Withdraw(4500);
		a.Checkbalance();
		
		
	
}
}