package game.model;

public class RandomNumberGenerator {

    public int rng(int max) {
        return (int) Math.floor(Math.random() * max);
    }
}
