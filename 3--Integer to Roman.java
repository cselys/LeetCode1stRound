public class Solution {
    public String intToRoman(int num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        String[][] map={
            { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" },
{ "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" },
{ "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" },
{ "M", "MM", "MMM", "", "", "", "", "", "" }};

String ret="";
int key=0;

while(num!=0){
    int d=num-num/10*10;
    if(d!=0)ret=map[key][d-1]+ret;
    key++;
    num=num/10;
    
}
return ret;


     
        
    }
}
