 public int climbStairs(int n) {
int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
         arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }



public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] records = new int[n+1];
        return climbStairsHelper(n,records);
         
    }
     
    public int climbStairsHelper(int n, int[] records){
        if(records[n]!=0){
            return records[n];
        }
        if(n<=1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        records[n] = climbStairsHelper(n-1,records)+climbStairsHelper(n-2,records);
        return records[n];
    }