 public static int longestConsecutive(int[] num) {
        Hashtable<Integer, Interval> ht = new Hashtable<Integer, Interval>();
        int max = 0;
        
        for(int i = 0; i < num.length; i++)
        {
            int tmp = num[i];
            if(!ht.containsKey(tmp))
            {
                int low = tmp;
                int high = tmp;
                
                ht.put(tmp, new Interval(high, low));
                if(ht.containsKey(tmp - 1))
                {
                    low = ht.get(tmp - 1).low;
                }
                if(ht.containsKey(tmp + 1))
                {
                    high = ht.get(tmp + 1).high;
                }
                            
                //update only the high and the low
                ht.get(low).high = high;
                ht.get(high).low = low;
                
                max = Math.max((high - low + 1), max);
            }
        }
        
        return max;
    }
