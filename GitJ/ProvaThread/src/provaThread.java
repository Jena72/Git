
public class provaThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//clsThread th1 = new clsThread();
		//th1.setCommand("calc.exe");
		//Thread t1= new Thread(th1);
		//t1.start();
		
		//clsThread th2 = new clsThread();
		//th2.setCommand("notepad.exe");
		//Thread t2= new Thread(th2);
		//t2.start();
		
		clsCounter c1 = new clsCounter();
		clsCounter c2 = new clsCounter();
		clsCounter c3 = new clsCounter();
		clsCounter c4 = new clsCounter();
		clsCounter c5 = new clsCounter();
		clsCounter c6 = new clsCounter();
		clsCounter c7 = new clsCounter();
		
		c1.setIntStart(5);
		c2.setIntStart(10);
		c3.setIntStart(15);
		c4.setIntStart(20);
		c5.setIntStart(25);
		c6.setIntStart(30);
		c7.setIntStart(35);
		
		Thread tc1 = new Thread(c1);
		Thread tc2 = new Thread(c2);
		Thread tc3 = new Thread(c3);
		Thread tc4 = new Thread(c4);
		Thread tc5 = new Thread(c5);
		Thread tc6 = new Thread(c6);
		Thread tc7 = new Thread(c7);
		
		tc1.start();
		tc2.start();
		tc3.start();
		tc4.start();
		tc5.start();
		tc6.start();
		tc7.start();
		
		
		
	}

}
