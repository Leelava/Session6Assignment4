package Session6Assignment4;

import java.io.PrintWriter;

public class BankATMException extends Exception {
	private String message;
	
	
	
	public BankATMException(String message) {
		super();
		this.message = message;
	}

	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}



	@Override
	public void printStackTrace(PrintWriter s) {
		
		super.printStackTrace(s);
		System.out.println("Exception occured:: " +message+getStackTrace());
	}
	
}
