import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
    }
    

//         //Работа с классом TreeMap

//         TreeMap<Integer, String> states = new TreeMap<Integer,String>();
//         states.put(10, "Germany");
//         states.put(2, "Spain");
//         states.put(9, "France");
//         states.put(4, "Italy");
//         states.put(5, "Russia");
//         states.put(6, "Tokio");
//         states.put(7, "London");
//         states.put(8, "Turkie");
//         states.put(3,"Nidherlande");
//         states.put(1, "Piska");


//         String first = states.get(2);
//         System.out.println(first);

//         for(Map.Entry<Integer, String> item : states.entrySet()){
        
//             System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
//         }

//             Set<Integer> keys = states.keySet();
//             System.out.println(keys);

//             Collection<String> value = states.values();
//             System.out.println(value);

//             Map<Integer, String> afterMap = states.tailMap(4);
//             System.out.println(afterMap);

//             Map<Integer, String> beforeMap = states.headMap(10);
//             System.out.println(beforeMap);

//             Map.Entry<Integer, String> lastItem = states.lastEntry();
//             System.out.println(lastItem);

//             Map.Entry<Integer, String> firstItem = states.firstEntry();
//             System.out.println(firstItem);

//             System.out.printf("Last item has key : %d, value : %s \n",lastItem.getKey(), lastItem.getValue());

//     }
// }


        //Работа с классом MAp
//         Map<Integer, String> states = new HashMap<Integer, String>();
//         states.put(1, "Germany");
//         states.put(2, "Spain");
//         states.put(4, "France");
//         states.put(3, "Italy");

//         String V = states.get(1);
//         System.out.println(V);

//         Set<Integer> keys = states.keySet();
//         System.out.println(keys);

//         states.replace(1, "Poland");
//         states.replace(2, "Russia");

//         states.remove(1);
//         states.put(1, "Polandia");

//         Collection<String> values = states.values();
//         System.out.println(values);

//         for(Map.Entry<Integer, String> item : states.entrySet()){
        
//             System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
//         }

//         Map<String, Phone> people = new HashMap<String, Phone>();
//         people.put("1240i54", new Phone("89630882704"));
//         people.put("1564i55", new Phone("89615626622"));
//         people.put("4540i56", new Phone("23432423423"));
        
//         for(Map.Entry<String, Phone> item : people.entrySet()){
        
//         System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getNumber());
//     }
//     }
// }

// class Phone{

//     private String number;
//     public Phone(String value){
    
//         number=value;
//     }
//     String getNumber(){return number;}



