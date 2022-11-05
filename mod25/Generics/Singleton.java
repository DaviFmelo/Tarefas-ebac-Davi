package Generics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Davi
 *
 */
public class Singleton {
    private static Singleton singleton;

    protected Map<Class, Map<?, ?>> map;

    private Singleton() {
        map = new HashMap<>();
    }

    public static Singleton getInstance() {

        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}