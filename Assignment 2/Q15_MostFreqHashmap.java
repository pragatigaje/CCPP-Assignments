import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q15_MostFreqHashmap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,3,6};
        int maxCount =0;
        int mf =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }

        //System.out.println(map);
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            //System.out.print(entry.getKey()+" : "+map.get(entry.getKey())+" , ");
            if(entry.getValue()>maxCount)
            {
                maxCount=entry.getValue();
                mf=entry.getKey();
            }
        }

        System.out.println(mf);
    }
}
