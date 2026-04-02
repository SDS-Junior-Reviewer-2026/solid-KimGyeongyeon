package greeter;

public class Greeter {
    GreetingStrategy strategy = GreetingFactory.getStrategy();

    public String greet() {
        return strategy.greet();
    }

    public void setFormality(String formality) {
        this.strategy = GreetingFactory.getStrategy(formality);
    }
}