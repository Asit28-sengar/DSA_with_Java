import java.util.List;
import java.util.Collections;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;  

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> myset = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
        {
            Set<Integer> setinteger = new HashSet<>();
            for (int j = i + 1; j < arr.length; j++) {
                List<Integer> temp = new ArrayList<>();
                int k = -(arr[i] + arr[j]);
                if (setinteger.contains(k)) {
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(k);
                    Collections.sort( temp);
                    {
                        myset.add( temp);
                    }
                }
                else
                {
                    setinteger.add(arr[j]);
                }
            }
        }
        list.addAll(myset);
        return list;
    }
}

