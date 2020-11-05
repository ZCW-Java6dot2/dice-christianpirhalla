
public class Simulation {
    int numberOfTosses;
    int numberOfDice;
    Bins bin;
    Dice dice;

    public Simulation(int d, int t){
        this.numberOfTosses = t;
        this.numberOfDice = d;
        this.bin = new Bins(2, 12);
        this.dice = new Dice(numberOfDice);

    }

    public void runSimulation(){
        for (int i = 1; i <= this.numberOfTosses; i++){
            int result = dice.tossAndSum();
            bin.incrementBin(result);
        }
    }

    public void printResults(){
        String repeated = "";
        double proportion = 0.0;
        int numStars = 0;

        System.out.println("***");
        System.out.println("Simulation of " + numberOfDice + " tossed for " + numberOfTosses + " times.");
        System.out.println("***");
        System.out.println();

        for (int i = 2; i <= 12; i++){
            // repeated stars = # of results / total tosses * 16, floored)
            proportion = (double) bin.getBin(i)/numberOfTosses;
            numStars = (int) Math.floor(proportion * 100);

            repeated = new String(new char[numStars]).replace("\0", "*");

            System.out.printf("%3d :" + "%9d:" + "%5.2f " + repeated + "\n",
                    i, bin.getBin(i), proportion);

        }

    }

}
