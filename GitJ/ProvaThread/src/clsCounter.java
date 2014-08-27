
public class clsCounter implements Runnable{

	private int intStart;

	/**
	 * @return the intStart
	 */
	public int getIntStart() {
		return intStart;
	}

	/**
	 * @param intStart the intStart to set
	 */
	public void setIntStart(int intStart) {
		this.intStart = intStart;
	}
	
	@Override
	public void run(){
		for (int i = intStart; i > 0; i--) {
			System.out.println("Iniziato da: " + getIntStart() + " ora: " + i);
		}
	}
	
}
