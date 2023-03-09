package in.balamt.practice.collections.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Program to find the duplicate items from the string array.
 *
 * OUTPUT of the following program is as follows
 * ----------------------------------------------------------------
 * world is Duplicate for 2 times
 * 0bit is Duplicate for 2 times
 * hello is Duplicate for 3 times
 * 1byte is Unique
 * sample is Unique
 * 120 is Duplicate for 5 times
 * Batman is Duplicate for 2 times
 * BatMan is Duplicate for 3 times
 * 20.23 is Unique
 * A is Unique
 * 900 is Unique
 * Super Man is Unique
 * 40 is Unique
 * 60.0 is Unique
 *
 * -----------------------------------------------------------------
 */
public class HashSetApp {

    public static void main(String...arg){
        String[] myDataArray = new String[]{
                "hello","world","sample","0bit","1byte","hello","world","hello","0bit"
        };

        Set<String> deDuplicatedSet = new HashSet<>();
        Map<String, Integer> duplicateMap = new HashMap<>();

        for(String s : myDataArray){
            if(!deDuplicatedSet.add(s)){
                if(duplicateMap.containsKey(s)){
                    duplicateMap.put(s, duplicateMap.get(s) + 1);
                }else{
                    duplicateMap.put(s, 2);
                }
            }
        }

        duplicateMap.forEach((s, integer) -> {
            deDuplicatedSet.remove(s);
            System.out.printf("%s is Duplicate for %d times%n", s, integer);
        });

        deDuplicatedSet.forEach(s -> System.out.printf("%s is Unique%n", s));

        String btm = new String("BatMan");
        Object[] sample = new Object[]{
                "Batman", "Super Man", 120, 900, 60d, 40L, 20.23d, 'A',
                120,120,120,120,"Batman", "BatMan", new String("BatMan"), btm
        };

        Set<Object> deDuplicatedObjectSet = new HashSet<>();
        Map<Object, Integer> duplicateObjectMap = new HashMap<>();

        for(Object s : sample){
            if(!deDuplicatedObjectSet.add(s)){
                if(duplicateObjectMap.containsKey(s)){
                    duplicateObjectMap.put(s, duplicateObjectMap.get(s) + 1);
                }else{
                    duplicateObjectMap.put(s, 2);
                }
            }
        }

        duplicateObjectMap.forEach((s, integer) -> {
            deDuplicatedObjectSet.remove(s);
            System.out.printf("%s is Duplicate for %d times%n", s, integer);
        });

        deDuplicatedObjectSet.forEach(s -> System.out.printf("%s is Unique%n", s));

    }

}
