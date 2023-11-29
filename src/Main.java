import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // create Map using HasMap
        Map<String, Integer> numbers = new HashMap<>();
        // insert element into Map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("Map : " + numbers);

        //access value of element
        int one = numbers.get("One");
        System.out.println("Value at key One = " + one);
        // get all key of Map
        System.out.println(numbers.keySet());
        // get all value of Map
        System.out.println(numbers.values());

        for (String s : numbers.keySet()){
            System.out.println(s);
        }
        List<String> myKeys = new ArrayList<>(numbers.keySet());
        System.out.println(myKeys);
        List<Integer> myValues = new ArrayList<>(numbers.values());
        System.out.println(myValues);

        // get all key and value
        System.out.println(numbers.entrySet());
        for (Map.Entry<String, Integer> entry : numbers.entrySet()){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key = " + key + " , value = " + value);
        }
        numbers.forEach((key, value) -> {
            System.out.println("value = " + value + ", key = " + key);
        });

        // change value in Map
        numbers.replace("Three", 4);
        System.out.println("Map has changed : " + numbers);
        // remove element in Map
        numbers.remove("Three");
        System.out.println("Map has removed : " + numbers);
        // count size Map
        System.out.println("Size : " + numbers.size());
        // check key exits
        if(numbers.containsKey("Three")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        if(numbers.containsValue(1)){
            System.out.println("OK");
        } else {
            System.out.println("Error");
        }
        if(numbers.isEmpty()){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        Map<String, Integer> products = new HashMap<>();
        products.put("Shoes", 200);
        products.put("Bag", 300);
        products.put("Pants", 400);
        int newPriceShoes = products.compute("Shoes", (k,v)-> v - v*10/100);
        System.out.println(products);
        System.out.println(newPriceShoes);

        LinkedHashMap<String, String> fruits = new LinkedHashMap<>();
        fruits.put("name", "Apple");
        fruits.put("color", "red");
        fruits.put("weight", "5");
        System.out.println(fruits);

        Map<String, ArrayList<String>> multiValue = new HashMap<String, ArrayList<String>>();
        multiValue.put("Honda", new ArrayList<String>());
        multiValue.get("Honda").add("Wave");
        multiValue.get("Honda").add("Dream");
        multiValue.get("Honda").add("Lead");
        multiValue.put("Yamaha", new ArrayList<String>());
        multiValue.get("Yamaha").add("Ex");
        multiValue.get("Yamaha").add("Nouvo");
        multiValue.get("Yamaha").add("Jupiter");
        System.out.println(multiValue);

        LinkedHashMap<String, ArrayList<Students>> students = new LinkedHashMap<String, ArrayList<Students>>();
        students.put("CNTT", new ArrayList<Students>());
        students.get("CNTT").add(new Students("BH001","Quang Teo"));
        students.get("CNTT").add(new Students("BH002","Giang Coi"));
        students.put("CK", new ArrayList<Students>());
        students.get("CK").add(new Students("BH003","Ty"));
        students.get("CK").add(new Students("BH004","Siu"));
        System.out.println(students.get("CK").get(0).name = "Teo");
        System.out.println(students);
    }
}