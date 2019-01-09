package banktest;



public class bank {
	private static Bank instance=new Bank();
	private client[]clients;
	private Logger logService;
	private float balance;
	private static float commissionRate;
	
	public static Bank getBank(){
		return instance;
	}
	
	
	public bank() {
		clients=new client[100];
		logService=new Logger("aaa");
	}
	
	

	public void setBalance() {
		this.balance = 0;
		
		for(int i=0;i<clients.length;i++) {
			if( clients[i]!=null) {
			this.balance=this.balance+clients[i].getFortune();
	}
		}
	this.balance=this.balance+commissionRate;
			
		}
	public float getBalance() {
		return this.balance;
	}

	public void addClient(client c) {
		for(int i =0;i<clients.length;i++) {
			if (clients[i]==null) {
				clients[i]=c;
				Log l= new Log(System.currentTimeMillis(),clients[i].getId() , "client c added to clients", clients[i].getFortune());
				logService=new Logger("aaa");
				logService.log(l);
				this.balance=this.balance+clients[i].getFortune();
			}
		}
		
			
	}
	public void removeClient(int id) {
		for (int i=0;i<clients.length;i++) {
			if((clients[i]!=null)&&(clients[i].equals(id))){
				this.balance=this.balance-clients[i].getFortune();
				clients[i]=null;
				Log l= new Log(System.currentTimeMillis(), clients[i].getId(), "remove a client", clients[i].getFortune());
				logService.log(l);
				
			}
		}
	}
	public client[]getClients(){
		return clients;
		
	}
}


