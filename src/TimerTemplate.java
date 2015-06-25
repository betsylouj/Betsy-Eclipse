import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.chrono.JapaneseChronology;

import javax.swing.JOptionPane;
import javax.swing.Timer;




public class TimerTemplate implements ActionListener {
	Timer T = new Timer(1000, this);
	int counter = 3;
	
	public static void main(String[] args) {
		new TimerTemplate();
	}
	
	TimerTemplate()
	{
		System.out.println("Running");
		T.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		counter = counter - 1;
		System.out.println(counter);
		if (counter == 0) {
			JOptionPane.showMessageDialog(null, "Time's up!");
			T.stop();
		}
		
	}

}
