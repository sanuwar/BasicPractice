import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        obj.put("john", 30);
        obj.put("Caleb", 32);
        obj.put("Jessi", 28);
        System.out.println("here" + obj);

        for (String i: obj.keySet()){
            System.out.println(i);
        }
        for (Integer i: obj.values()){
            System.out.println(i);
        }

        for (String i : obj.keySet()){
            System.out.println("name " +i + "  age "+  obj.get(i));
        }
    }
}
