package banktest;

public class Log {
	private long timestamp;
	private int clientId;
	private String description;
	private float amount;
	
	public Log(long timestamp,int clientId,String description,float amount) {
		this.timestamp=timestamp;
		this.clientId=clientId;
		this.description=description;
		this.amount=amount;
		
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getData() {
		System.out.println(timestamp+","+"clientId  "+clientId+","+description+","+amount);
	}

}
