package banktest;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Logger {
	private String driverName;
	
	public Logger(String driverName) {
		this.driverName=driverName;	
	}
public void log(Log l) {
	System.out.println(l.getData());
}
public Log[]getLogs(){
	return null;
}
		
}

