    public class Solution {  
        public ArrayList<String> anagrams(String[] strs) {  
            // Start typing your Java solution below  
            // DO NOT write main() function  
            Map<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();  
            ArrayList<String> rel = new ArrayList<String>();  
              
              
            for( int i=0; i<strs.length; i++) {  
                char[] c = strs[i].toCharArray();  
                Arrays.sort(c);  
                String s = new String(c);  //!!!!alert!!! super important. != t.toString(){ [C@6e1408 }  
                if( map.containsKey(s) ) {  
                    map.get(s).add( strs[i]);   // add() will return false or true;   
                } else {  
                    LinkedList<String> ll = new LinkedList<String>();  
                    ll.add( strs[i] );  
                    map.put(s, ll);  
                }  
            }  
              
            for(LinkedList<String> ll : map.values() ) {  
                if( ll.size() > 1) {  
                    rel.addAll( ll );  
                }  
            }  
              
            return rel;  
        }  
    }  





import java.util.*;
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result = new ArrayList<String>();
        
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        
        for(String str : strs){
            char[] tempstr= str.toCharArray();
            Arrays.sort(tempstr);
            String sortedstr = new String(tempstr);
            if(map.containsKey(sortedstr)){
                map.get(sortedstr).add(str);
            }else{
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(sortedstr,list);
            }
        }
        
        for(ArrayList<String> list:map.values())
            if(list.size()>1)
                for(String str : list)
                    result.add(str);
                    
        return result;
    }f
}