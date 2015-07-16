
public class Popcorn {
	int timer = 3;
	private int kernels = timer*10;
        private String flavor;
    Popcorn myPopcorn ;
    Microwave myMicrowave;
    
    Popcorn(String flavor) {
        this.flavor = flavor;
        System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
    }
    
    public static void main(String[] args) {
	 	
	new Popcorn("salty").makePopcorn();
	}


    void makePopcorn() {
    	myMicrowave = new Microwave();
    	myMicrowave.putInMicrowave(this);
    	myMicrowave.setTime(timer);
    	myMicrowave.startMicrowave();
		
	}

	public void applyHeat() {
        pause();
        if (kernels == 0) {
            System.out.println("Popcorn says: Time to eat popcorn!");
        } else {
            System.out.println("POP!" + kernels);
            kernels--;
        }
    }

    private void pause() {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

