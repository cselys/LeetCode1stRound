public class Solution {
  
    
     public int lengthOfLongestSubstring(String s) {
     // Start typing your Java solution below
     // DO NOT write main() function
     int n = s.length();
     if(n <= 1)  return n;
     int max = 0, len = 0, start = 0;
     Map<Character, Integer> hs = new HashMap<Character, Integer>();
     for(int i = 0; i < n; i++) {
         if(len > max) {
             max = len;
         }
         char c = s.charAt(i);
         if(!hs.containsKey(c)) {
             hs.put(c, i);
             len++;
         } else {
             int dupIndex = hs.get(c);
             for(int j = dupIndex; j >= start; j--) {
                 hs.remove(s.charAt(j));
                 len--;
             }
             hs.put(c, i);
             start = dupIndex + 1;
             len++;
         }
     }
     if(len > max)
         max = len;
     return max;
}
}