 HashMap<Character, Character> map = new HashMap<Character, Character>();  
   map.put(')', '(');  
   map.put(']', '[');  
   map.put('}', '{');  
   
   Stack<Character> stack = new Stack<Character>();  
   for (int i=0; i<s.length(); ++i) {  
     char c = s.charAt(i);  
     if (!map.containsKey(c)) {  
       stack.push(c);  
     } else if (stack.isEmpty() || stack.pop() != map.get(c)) {  
       return false;  
     }  
   }  
   
   return (stack.isEmpty());  