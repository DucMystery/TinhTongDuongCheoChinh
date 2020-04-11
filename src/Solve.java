import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myArr[][] = {{1,2,3},{1,2,3},{1,2,3}};

        checkMatrix(myArr,3,3);
    }

    public static void checkMatrix(int arr[][],int rows,int cols){
        int sum =0;
        if (rows==cols){
            for (int i=0;i<rows;i++){
                for (int j=0;j<cols;j++){
                    if (i==j){
                        sum+=arr[i][j];
                    }
                }
            }
            System.out.printf("Ma tran ban co tong duong cheo la : %d",sum);
        }else {
            System.out.println("Ma tran cua ban ko phai ma tran vuong nen ko co duoc cheo chinh");
        }
    }
}
