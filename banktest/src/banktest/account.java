package banktest;

import bank.Log;
import bank.Logger;

public class account {
private int Id;
private float balance;


public account(int Id, float balance) {
	this.Id=Id;
	this.balance=balance;
}


public float getBalance() {
	return balance;
}


public void setBalance(float balance) {
	this.balance = balance;
	Log l=new Log(System.currentTimeMillis(),Id,"this account balance was updated",balance);
	Logger logger=new Logger("aaa");
	logger.log(l);
}


public int getId() {
	return Id;
}
}
