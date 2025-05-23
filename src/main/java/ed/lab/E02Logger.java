package ed.lab;

import java.util.HashMap;

public class E02Logger {
    private HashMap<String, Integer> mensajes;

    public E02Logger() {
        mensajes = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!mensajes.containsKey(message) || timestamp >= mensajes.get(message)) {
            mensajes.put(message, timestamp + 10);
            return true;
        }

        return false;
    }
}
