import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CutenessTV implements ActionListener {
	JButton frogB = new JButton("Frog");
	JButton duckB = new JButton("Duck");
	JButton unicornB = new JButton("Unicorn");
	
	public static void main(String[] args) {
	CutenessTV ctv = new CutenessTV();
	ctv.makeTV();
	}
	
	public void makeTV() {
		JFrame tvFrame = new JFrame("Cute TV");
		tvFrame.setVisible(true);
		JPanel tvPanel = new JPanel();
		frogB.addActionListener(this);
		duckB.addActionListener(this);
		unicornB.addActionListener(this);
		tvPanel.add(duckB);
		tvPanel.add(frogB);
		tvPanel.add(unicornB);
		tvFrame.add(tvPanel);
		tvFrame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Action");
		if (e.getSource() == duckB ){
			showDucks();
		}
		else if (e.getSource() == frogB ){
			showFrog();
		}
		else if (e.getSource() == unicornB ){
			showFluffyUnicorns();
		}
	}

	void showDucks() {
        playVideo("3RkFAN7PTG4");
    }

	void showFrog() {
        playVideo("aSjCb-FfxhI");
    }
    void showFluffyUnicorns() {
        playVideo("qRC4Vk6kisY");
    }

    void playVideo(String videoID) {
        try {
        	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
