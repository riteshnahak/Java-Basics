package mapconcept;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        // using zero param constructor of hashmap for object creation
        HashMap hm=new HashMap();
        hm.put(10,"Sachin");
        hm.put(18,"Virat");
        hm.put(45,"ROHIT");
        hm.put(7,"DHoni");
        System.out.println(hm);


        Set set=hm.keySet();
        System.out.println(set);
        System.out.println(set.getClass().getName());

        Collection collection=hm.values();
        System.out.println(collection);
        System.out.println(collection.getClass().getName());

        Set mapData=hm.entrySet();
        System.out.println(mapData);
        System.out.println(mapData.getClass().getName());


        // Map don't have iterator but for set we can use iterator
        Iterator iterator =mapData.iterator();
        while (iterator.hasNext()){
            Map.Entry data=(Map.Entry)iterator.next();
            System.out.println(data.getKey() +":" + data.getValue());
            if (data.getKey().equals(10)) {
                data.setValue("SRT");
            }
        }
        System.out.println(hm);

    }
}
