
import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
    /*
     * This is an advanced recipe. There may be more than one line of code for
     * each instruction.
     */

    public static void main(String[] args) throws InterruptedException {

        /* 1. Make a CowTimer, set the time and start it. */
    	CowTimer CT1 = new CowTimer();
    	String timeS = JOptionPane.showInputDialog("How many seconds?");
    	int minutes = Integer.parseInt(timeS);
    	CT1.setTime(minutes);
    	CT1.start();
    }

   private int minutes;
   
    public void setTime(int time1) {
        this.minutes = time1;
        System.out.println("Cow set to " + minutes + " minutes.");
    }


    public void start() throws InterruptedException {
        /*
         * 2. Count down the minutes, print the current minute then sleep for 60
         * seconds using Thread.sleep(int milliseconds).
          */
    	for (int i = minutes;i>0;i--){
    		System.out.println(i+" seconds");
    		Thread.sleep(1000);
    	}
        /*
         * 3. When the timer is finished, use the playSound method to play a moo
         * sound. You can download one from freesound.org, then drag it into
         * your default package. Tell the students (by speaking) it's time to walk.
         */
    	System.out.println("Playing moo");
    	playSound("moo.wav");
    	System.out.println("Finished moo");
    	speak("Time to walk");
    }


    private void playSound(String fileName) {
        AudioClip sound = JApplet
                .newAudioClip(getClass().getResource(fileName));
        sound.play();
        System.out.println("Still playing moo");
    }


private void speak(String stuffToSay) {

 /*       try {
            Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
System.out.println("Time to walk");
    }
}


