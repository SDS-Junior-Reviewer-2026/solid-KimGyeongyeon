package greeter;

public class Greeter {
    GreetingStrategy strategy = GreetingFactory.getStrategy(null);

    public String greet() {
        return strategy.greet();
    }

    public void setFormality(String formality) {
        this.strategy = GreetingFactory.getStrategy(formality);
    }
}