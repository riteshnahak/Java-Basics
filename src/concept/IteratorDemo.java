package concept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        for(int i=1;i<=10;i++){
            arrayList.add(i);
        }
        System.out.println("Iterate one by one");
//        for (int num:arrayList) {
//            System.out.println(num);
//        }
        Iterator<Integer> itr =arrayList.iterator();
        while(itr.hasNext()){
            Integer data=itr.next();
            if(data%2==0){
                System.out.println(data+" is even no");
            }else
                itr.remove();
        }
        System.out.println(arrayList);

    }
}
