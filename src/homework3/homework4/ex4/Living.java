package homework3.homework4.ex4;

public abstract class Living {
    private boolean isAlive;
    private double weight;

    public Living(double weight) {
        this.isAlive = true;
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public double getWeight() {
        return weight;
    }

    public void die() {
        this.isAlive = false;
    }

    protected void increaseWeight(double additionalWeight) {
        this.weight += additionalWeight;
    }
}
