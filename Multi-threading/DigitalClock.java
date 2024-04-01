
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable { // Use interface runnable if you are extending a class
	JLabel clock;
	Date date;
	String dateString;

	public DigitalClock() {

		date = new Date();
		dateString = String.valueOf(date);
		dateString = dateString.substring(11, 19);
		clock = new JLabel(dateString);
		this.add(clock);
		this.pack();
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
				date = new Date();
				dateString = String.valueOf(date);
				dateString = dateString.substring(11, 19);
				clock.setText(dateString);

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		DigitalClock digitalClock = new DigitalClock();
		digitalClock.run();
	}
}
