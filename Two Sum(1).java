public class Solution {  
    public int[] twoSum(int[] numbers, int target) {  
        // Start typing your Java solution below  
        // DO NOT write main() function  
        int len = numbers.length;  
        assert(len >= 2);  
          
        int[] ret = new int[2];  
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();  
          
        for(int i = 0; i < len; i++){  
            if( !map.containsKey(numbers[i]) ){  
                map.put(target - numbers[i], i);        // save another number  
            }  
              
            if( map.containsKey(numbers[i]) ){          // check is another number  
                int idx = map.get(numbers[i]);  
                if(idx < i){  
                    ret[0] = idx + 1;   // +1 for not zero-based  
                    ret[1] = i + 1;  
                }  
            }  
        }  
          
        return ret;  
    }  
}  