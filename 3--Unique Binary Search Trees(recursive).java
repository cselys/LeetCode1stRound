public class Solution {
public int numTrees(int n) {
    // Start typing your Java solution below
    // DO NOT write main() function
    return uniqueBinarySearchTreesHelper(1, n);
}
public int uniqueBinarySearchTreesHelper(int s, int e){
    if(s > e)
        return 1;
    if(s == e)
        return 1;

    int ret = 0;
    for(int i = s; i <= e; i++)
        ret += uniqueBinarySearchTreesHelper(s, i - 1) * uniqueBinarySearchTreesHelper(i + 1, e);

    return ret;
}
}