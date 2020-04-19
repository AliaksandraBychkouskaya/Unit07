package by.tr.mod7;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int [][] array;
        array = initializeArray();
        System.out.println("Изначальный массив");
        printArray(array);
        //System.out.println("Сумма отрицательных элементов = "+ sumOfNegativeValues(array));
        //maxElementInLine(array);
        array = changeMaxMin(array);
        System.out.println("Итоговый массив");
        printArray(array);
    }
    public static void printArray(int[][] arr){
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] initializeArray(){
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во строк в массиве");
        n = sc.nextInt();
        System.out.println("Введите кол-во столбцов в массиве");
        m = sc.nextInt();
        int [][] arr = new int[n][m];

        String str = "";
        for (int i = 0; i < n; i++) {
            System.out.println("Введите "+ (i+1) + " строку массива");
            for (int j = 0; j < m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int[] sumOfNegativeValues(int [][]arr){
        int[] result = new int[arr.length];

        for (int i = 0 ; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j]<0)
                    sum += arr[i][j];
            }
            result[i] = sum;
        }

        return result;
    }

    public static int[] maxElementInLine(int [][]arr){
        int [] answer = new int [arr.length];
        for (int i = 0 ; i < arr.length; i++) {
            int maxi = arr[i][0];
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > maxi)
                    maxi = arr[i][j];
            }
            answer[i]=maxi;
        }
        return answer;
    }
    public static int [][] changeMaxMin(int [][]arr){
        int max,min,maxindexi,maxindexj,minindexi,minindexj;
        max = min = arr[0][0];
        maxindexi = 0;
        maxindexj = 0;
        minindexi = 0;
        minindexj = 0;
        for (int i = 0 ; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxindexi = i;
                    maxindexj = j;
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minindexi = i;
                    minindexj = j;
                }
            }
        }
        arr[maxindexi][maxindexj]= min;
        arr[minindexi][minindexj]= max;
        return arr;
    }
}
