class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        /**
        从右上角开始走，利用这个顺序关系可以在O(m+n)的复杂度下解决这个题：
        1.当前位置元素比target小，则y++，相当于在该列继续查找
        2.当前位置元素比target大，则x--, 相当于该列删除       
        3.如果相等，返回true
        4.如果越界了还没找到，说明不存在，返回false
        */
        if (matrix.length == 0) return false;
        int _col = matrix[0].length;
        int _row = matrix.length;
        // 注意边界条件判断
        int x = _col - 1, y = 0;
        while (x >= 0 && y < _row) {
            if (matrix[y][x] == target) return true;
            else if (matrix[y][x] > target) x = x - 1;
            else y = y + 1;
        }
        return false;
    }
}
