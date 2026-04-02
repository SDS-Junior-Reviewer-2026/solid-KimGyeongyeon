package birds;

public abstract class Bird {
    String currentLocation;
    int numberOfFeathers;

    public void molt() {
        this.numberOfFeathers--;
    }
}