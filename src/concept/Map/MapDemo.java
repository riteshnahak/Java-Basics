package concept.Map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(10,"Sachin");
        hm.put(18,"Virat");
        hm.put(45,"Rohit");
        Set set=hm.keySet();
        System.out.println(set);
        Collection coll=hm.values();
        System.out.println(coll);
        Set full=hm.entrySet();
        System.out.println(full);
        Iterator ite= full.iterator();
        while (ite.hasNext()){
            Map.Entry data= (Map.Entry) ite.next();
            System.out.println(data.getKey()+":"+data.getValue());
        }
    }
}
