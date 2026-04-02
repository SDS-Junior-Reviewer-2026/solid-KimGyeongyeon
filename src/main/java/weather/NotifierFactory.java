package weather;

import java.util.HashMap;
import java.util.Map;

public class NotifierFactory {
    private static final Map<String, Notifier> notifiers = new HashMap<String, Notifier>();
    private static final Notifier DEFAULT_NOTIFIER;

    static {
        notifiers.put("rainy", new Phone());
        notifiers.put("sunny", new Email());
        DEFAULT_NOTIFIER = notifiers.get("sunny");
    }

    static Notifier create(String weather) {
        return notifiers.getOrDefault(weather, DEFAULT_NOTIFIER);
    }
}
