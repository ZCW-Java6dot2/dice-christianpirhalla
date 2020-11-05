import java.util.Random;

public class Dice {
    int seed; // random seed 5 by default
    int numDice;
    int sides; //number of sides in the die, just for fun
    Random random;

    public Dice(int i) {
        this.numDice = i;
        this.seed = 5;
        this.sides = 6;
        this.random = new Random(5);
    }

    public int getSeed() {
        return this.seed;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        for (int i = 1; i <= numDice; i++){
            sum += (random.nextInt(sides) + 1); //we have to add one because of the floor of 0;
        }
        return sum;
    }
}
