import java.util.HashMap; //Aula sobre Hash
import java.util.HashSet;

public class Aula11 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Cascavel", 372026);
        mapa.put("Corbelia", 17470);
        int x = mapa.get("Corbelia");
        System.out.println(x);
        System.out.println(mapa.size());

        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("a");
        conjunto.add("b");
        conjunto.add("a");
        boolean existe = conjunto.contains("a");
        System.out.println(existe);
        System.out.println(conjunto.size());
    }
}
 