class Microwave {

    private int cookTime;
    Popcorn thingToBeCooked;
    

    Microwave() {
        System.out.println("Microwave says: a Microwave has been made.");
    }

    void putInMicrowave(Popcorn thingToBeCooked) {
        System.out.println("Microwave says: popcorn put in microwave.");
        this.thingToBeCooked = thingToBeCooked;
    }

    void setTime(int cookTimeInMinutes) {
        System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
        this.cookTime = cookTimeInMinutes;
        //Added line below
        System.out.println("Microwave says: cook time is set to " + cookTime + " minutes.");
    }

    void startMicrowave() {
        if (thingToBeCooked == null)
            System.out.println("Microwave says: there's nothing in the microwave!");
        for (int i = 0; i < cookTime*10 + 1; i++) {
        	//Added line below
            System.out.println("cooking " + i);
            thingToBeCooked.applyHeat();
        }
    }
}


