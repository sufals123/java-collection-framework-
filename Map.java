import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("Core Java", 3000);
        map.put("spring", 6000);
        map.put("JavaScript", 9000);
        map.put("Python", 9999);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("Core Java"));
        System.out.println(map.containsKey("Core Java"));
        System.out.println(map.containsValue(3000));
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.remove("Core Java"));
        System.out.println(map);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("Core Java"));
        
        map.forEach((key, value)->{
            System.out.println(key + "=" + value);
        });
    }
}
