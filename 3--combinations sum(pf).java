public class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(candidates.length == 0) return ret;
        Arrays.sort(candidates);
        
        combinationSumHelper(candidates, target, 0, 0, ret, list);
        
        return ret;
    }
    
    public void combinationSumHelper(int[] input, int target, int start, int sum,
                                    ArrayList<ArrayList<Integer>> ret,
                                    ArrayList<Integer> list) {
        if(sum > target) return;// Note: This method cannot finish large set if this line is missing
        for(int i = start; i < input.length; i++) {
            list.add(input[i]);
            sum += input[i];
            if(sum == target) {
                ret.add(new ArrayList<Integer>(list));
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return;
            }
 
            if(sum < target) {
                combinationSumHelper(input, target, i, sum, ret, list);
            } else {
                combinationSumHelper(input, target, i+1, sum, ret, list);
            }
 
            sum -= list.get(list.size() - 1);
            list.remove(list.size() - 1);
        }
        
        return;
    }
}




import java.util.*;

public class CombinationSum {

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
            int target) {
        // Start typing your Java solution below
        // DO NOT write main() function

        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        int current = 0;
        compute(candidates, target, current, temp, res);

        return res;
    }

    static Map<String, Integer> map = new HashMap<String, Integer>();

    public static void compute(int[] candidates, int target, int current,
            ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> res) {
        if (current > target)
            return;

        if (current == target) {
            ArrayList<Integer> list = new ArrayList<Integer>(temp);
            java.util.Collections.sort(list);
            String sig = list.toString();
            if (!map.containsKey(sig)) {
                res.add(list);
                map.put(sig, 1);
            }

            return;
        }

        int len = candidates.length;
        for (int i = 0; i < len; i++) {
            int value = candidates[i];
            temp.add(value);
            current += value;
            compute(candidates, target, current, temp, res);
            temp.remove(temp.size() - 1);
            current -= value;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] candidates = {2,3,6,7};
        ArrayList<ArrayList<Integer>> res  = combinationSum(candidates, 7);
        for (ArrayList<Integer> list:res) {
            System.out.println(list);
        }
    }

}
