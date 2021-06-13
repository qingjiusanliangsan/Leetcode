package lc_500.lc74;

/**
 * @author qingjiusanliangsan
 * create 2021-03-30-9:20
 */
public class Solution {
    static public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int len = n*m;
        int a =1;
        int b = len;
        while(a<=b){
            int ai = (a-1)/m;
            int aj = (a-1)%m;
            int bi = (b-1)/m;
            int bj = (b-1)%m;
            if(matrix[ai][aj]>target||matrix[bi][bj]<target){
                return false;
            }
            if(matrix[ai][aj]==target||matrix[bi][bj]==target){
                return true;
            }
            int tem = (a+b)/2;
            int temi = (tem-1)/m;
            int temj = (tem-1)%m;
            if(matrix[temi][temj]==target){
                return true;
            }else if(matrix[temi][temj]<target){
                a = tem+1;
                b = b-1;
                System.out.println(a);
                System.out.println(b);
                continue;
            }else if(matrix[temi][temj]>target){
                a = a+1;
                b = tem-1;
                System.out.println(a);
                System.out.println(b);
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int ta = 23;
        System.out.println(searchMatrix(matrix,ta));
    }
}
