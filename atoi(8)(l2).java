public class Solution {
    public int atoi(String s ){
        // Start typing your Java solution below
        // DO NOT write main() function

        s = s.trim();  
        long value = 0;  
        boolean isPositive = true;  
          
        for (int i = 0; i < s.length(); i++) {  
            if (i == 0 && (s.charAt(i) == '+' || s.charAt(i) == '-')) {  
                if (s.charAt(i) == '-') {  
                    isPositive = false;  
                }  
                continue;  
            }  
            if (s.charAt(i) < '0' || s.charAt(i) > '9') break;  
            value = 10 * value + s.charAt(i) - '0';  
        }  
        value = isPositive == true ? value : value * -1;  
        if (value < -2147483648) {  
            return -2147483648;  
        } else if (value > 2147483647) {  
            return 2147483647;  
        } else {  
            return (int) value;  
        }  
    }
}