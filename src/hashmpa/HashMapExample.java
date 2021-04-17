package hashmpa;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("web", 1024);
        map.put("database", 2048);
        map.put("static", 5120);

        System.out.println("Java 8 forEach loop");
        map.forEach((key, value) -> System.out.println("[Key] : " + key + " [Value] : " + value));

        System.out.println("for entrySet()");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }

        System.out.println("Iterator");
        Iterator iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
        }

    }

}
