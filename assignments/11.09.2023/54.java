class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> li = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        
        int rmin = 0;
        int cmin = 0;
        int rmax = n-1;
        int cmax = m-1;
        int counter = 1;
        
        
         while(counter<=n*m){
            for(int col = cmin;col<=cmax && counter<=n*m;col++){
               li.add(arr[rmin][col]);
                counter++;
            }
            rmin++;
            
            for(int row = rmin;row<=rmax && counter<=n*m;row++){
              li.add(arr[row][cmax]);
                counter++;
            }
            cmax--;
            
            
            for(int col = cmax;col>=cmin && counter<=n*m;col--){
              li.add(arr[rmax][col]);
                counter++;
            }
            rmax--;
            
            
            for(int row = rmax;row>=rmin && counter<=n*m;row--){
               li.add(arr[row][cmin]);
                counter++;
            }
            cmin++;
            
           
        }
        
        return li;
        
    }
}