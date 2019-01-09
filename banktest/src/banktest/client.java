package banktest;

import java.nio.channels.ClosedByInterruptException;

import javax.security.auth.login.AccountException;

public class client {
	private int Id;
	private String name;
	private float balance;
    private account []accounts=new account[5];
    private  float commissionRate;
    private float interestRate;
    private Logger logger;
    
    public client(int Id,String name,float balance) {
    	this.Id=Id;
    	this.name=name;
    	this.balance=balance;
    }

	public int getId() {
		return Id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public account[] getAccounts() {
		return accounts;
	}
	
  public void addAccount(account a) {
	  for (int i=0;i<accounts.length;i++) {
		  if (accounts[i]==null) {
			  accounts[i]=a;	
			  return;
	  }
  }
	  
  }
  public account getAccount(int index) {
	  return accounts[index];
  }
  public void removeAccount(int id) {
	  for (int i=0;i<accounts.length;i++) {
		  if ((accounts[i]!=null)&&(accounts[i].getId()==id)){
			  this.balance=this.balance+accounts[i].getBalance();
			  accounts[i]=null;
			   Log l=new Log(System.currentTimeMillis(), Id, "was Closed by client",accounts[i].getBalance() );
			  Logger logger = new Logger("aaa");
			  this.logger.log(l);
			  
		  }
	  }
  }
  public void deposit(float amount) {
	  this.balance=this.balance+amount;
	  
  }
  public void withdraw(float amount) {
	  if (this.balance-amount>0){
	  this.balance=this.balance-amount;
  }
}
  public void autoUpdateAccount() {
	  interestRate=0;
	  for(int i=0;i<accounts.length;i++) {
		  if(accounts[i]!=null) {
		  accounts[i].setBalance(accounts[i].getBalance()+interestRate);
		  
	  }
	  }
  }
  public float getFortune() {
	 float total=this.balance;
	 for (int i=0;i<accounts.length;i++) {
		 if(accounts[i]!=null) {
		 total=total+accounts[i].getBalance(); 
	 }
	  
	  
  }
	 return total;
	  
  }
