public class Solution {
    private char[][] map=new char[][]{{},{},
        { 'a', 'b', 'c' }, { 'd', 'e', 'f' },
    		{ 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
			{ 'p', 'q', 'r', 's' }, { 't', 'u', 'v'}, { 'w', 'x', 'y', 'z' }
    
    };
    public ArrayList<String> letterCombinations(String digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> ret = new ArrayList<String>();
    	StringBuilder sb = new StringBuilder();
		letterCombinations(digits, 0, sb, ret);
		return ret;
    }
    
    void letterCombinations(String digits,int size, StringBuilder sb,ArrayList<String>  ret){
        if(size>=digits.length())
            ret.add(sb.toString());
        else{
            int index=digits.charAt(size)-'0';
            int iL=map[index].length;
            
            for(int j=0;j<iL;j++){
                sb.append(map[index][j]);
                letterCombinations(digits,size+1,sb,ret);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        
    
    }
    
}