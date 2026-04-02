package greeter;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;

// 1. 전략 인터페이스
public interface GreetingStrategy {
    String greet();
    String getMode();
}

// 2. 구체적인 전략 클래스들
class FormalGreeting implements GreetingStrategy {
    @Override public String greet() { return "Good evening, sir."; }
    @Override public String getMode() { return "formal"; }
}
class CasualGreeting implements GreetingStrategy {
    @Override public String greet() { return "Sup bro?"; }
    @Override public String getMode() { return "casual"; }

}
class IntimateGreeting implements GreetingStrategy {
    @Override public String greet() { return "Hello Darling!"; }
    @Override public String getMode() { return "intimate"; }

}
class DefaultGreeting implements GreetingStrategy {
    @Override public String greet() { return "Hello."; }
    @Override public String getMode() { return "default"; }
}

// 3. 전략을 싱글톤으로 제공하는 팩토리
class GreetingFactory {
    private static final Map<String, GreetingStrategy> STRATEGIES;

    static {
        Map<String, GreetingStrategy> map = new HashMap<>();
        map.put("formal", new FormalGreeting());
        map.put("casual", new CasualGreeting());
        map.put("intimate", new IntimateGreeting());
        STRATEGIES = Collections.unmodifiableMap(map);
    }

    public static GreetingStrategy getStrategy(String formality) {
        return STRATEGIES.getOrDefault(formality, new DefaultGreeting());
    }
}