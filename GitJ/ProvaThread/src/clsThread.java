import java.io.IOException;


public class clsThread implements Runnable {
	
	private String cmd;
	
	
	
	/**
	 * @return the cmd
	 */
	public String getCommand() {
		return cmd;
	}



	/**
	 * @param cmd the cmd to set
	 */
	public void setCommand(String cmd) {
		this.cmd = cmd;
	}



	@Override
	public void run(){
		
		System.out.println("Entro in Run");
		try {
			Runtime.getRuntime().exec(cmd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	

}
