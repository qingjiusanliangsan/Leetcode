package competition.double_52;

/**
 * @author qingjiusanliangsan
 * create 2021-05-15-22:55
 */
public class Sou3 {
    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] ret = new char[n][m];
        int ind;
        int num=0;
        for(int i =0;i<m;i++){
            for(int j = n-2; j>=0;--j){
                int tem = j;
                if(box[i][tem] == '#'){
                    while(tem<n-1 && box[i][tem+1] == '.'){
                        box[i][tem+1] = '#';
                        box[i][tem] = '.';
                        tem++;
                    }
                }
            }
        }
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                ret[j][m-1-i] = box[i][j];
            }
        }
        return ret;


    }
}
