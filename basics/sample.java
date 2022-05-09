import java.util.*;
import java.util.concurrent.*;
class Example extends Thread{
       Map siMap;
       Example(Map m){
               this.siMap = m;
        }
        public void run(){
               siMap.put("D",4);
        }
}
class FClass{
      public static void main (String[] args) {
            Map<String, Integer> siMap = new ConcurrentHashMap();
            String[] str = {"A", "B", "C"};
            Integer[] arr = {1, 2, 3};
            for(int i = 0; i < str.length; i++){
                    siMap.put(str[i],arr[i]);
            }
           Example t = new Example(siMap);
            t.start();
           Set s = siMap.entrySet();
           Iterator itr = s.iterator();
           while(itr.hasNext()){
                  Map.Entry m = (Map.Entry)itr.next();
                  System.out.println(m.getKey() + " => " + m.getValue());
            }
     }
}