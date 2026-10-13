class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int column = matrix[0].length, rows =matrix.length;
        int l=0,h=rows*column-1;
        while(l<=h){
            int mid = l+(h-l)/2;
            int midrow=mid/column , midcolumn=mid%column;
            if(matrix[midrow][midcolumn]==target)return true ;
            else if(matrix[midrow][midcolumn]>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}