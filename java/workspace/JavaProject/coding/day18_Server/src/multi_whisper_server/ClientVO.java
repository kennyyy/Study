package multi_whisper_server;

import java.io.PrintWriter;

public class ClientVO {

	private String userId;
	private PrintWriter pw;
		
	public ClientVO() {
	
	}

	public ClientVO(String userId, PrintWriter pw) {
		super();
		this.userId = userId;
		this.pw = pw;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public PrintWriter getPw() {
		return pw;
	}

	public void setPw(PrintWriter pw) {
		this.pw = pw;
	}

	
	
}
