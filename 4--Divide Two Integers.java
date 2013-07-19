public class Solution {
    public int divide(int dividend, int divisor) {
               // Start typing your C/C++ solution below  
        // DO NOT write int main() function  
        long a = dividend;  
        long b = divisor;  
          
        int sign = 1;  
        if(a < 0){  
            a = -a;  
            sign *= -1;  
        }  
          
        if(b < 0){  
            b = -b;  
            sign *= -1;  
        }  
          
        int d = 0;  
        while ( (b << d) <= a )  
        {  
            ++d;  
        }  
          
        --d;  
          
        int res = 0;  
        for (int i = d; i >= 0; --i) {  
            if ( (b << i) <= a ) {  
                res += (1 << i);    // high to low  
                a -= (b << i);      // remaider  
            }  
        }  
  
        return sign * res;          
    }
}