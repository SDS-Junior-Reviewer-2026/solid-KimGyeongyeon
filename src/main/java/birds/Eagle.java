package birds;

import birds.action.Flyable;

public class Eagle extends Bird implements Flyable {
    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }
}