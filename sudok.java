public class sudok {
    public static void main(String[] args) {
        int sumv = 0;
        int sumh= 0;
        int sumg = 0;
        int countv=0;
        int counth=0;
        int countg = 0;
        int[][] a = new int[][]{{1,2,3,4,5,6,7,8,9},{2,3,4,5,6,7,8,9,1},{3,4,5,6,7,8,9,1,2},{4,5,6,7,8,9,1,2,3},{5,6,7,8,9,1,2,3,4},{6,7,8,9,1,2,3,4,5},{4,5,6,7,8,9,1,2,3},{5,6,7,8,9,1,2,3,4},{6,7,8,9,1,2,3,4,5}};
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            sumh+=a[i][j];
            sumv+=a[j][i];

        }
        if(sumh!=45){
            counth=1;
        }
        if(sumv!=45){
            countv=1;
        }
        for(int k = 0;k<9;k=k+3){
            for(int l=0;l<3;++l){
                for(int m=0;m<3;++m){
                    sumg+=a[k+l][m];


                }
            }
        }
        

}
if(counth==0 && countv==0){
    System.out.println(" a valid Sudoku");
}
else{System.out.println("not a valid Sudoku");
}}}