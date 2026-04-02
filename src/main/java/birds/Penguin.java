package birds;

import birds.action.Swimable;

public class Penguin extends Bird implements Swimable {
    public Penguin(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void swim() {
        this.currentLocation = "in the water";
    }
}