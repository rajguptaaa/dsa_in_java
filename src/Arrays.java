import java.util.*;
public class Arrays {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        //Arrays
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }


        // int len = arr.length;
        // for(int i=0; i<len; i++){
        //     System.out.print(arr[i]);
        //     if(i != len-1) System.out.print(", ");
        // }

        //2D Arrays
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // int[][] arr = new int[row][col];
        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        arr[1][1] = 99;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        

        // sc.close();
    }
}
