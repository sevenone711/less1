package moth2.lesson3;

public class ArraySpiral {
    public static void main(String[] args) {

        spiral(8,4);
    }
    public static void spiral(int a,int b){

        int m = a;
        int n = b;
        int s = 1;

        int[][] array = new int[m][n];



        for (int x = 0; x < m; x++) {
            array[x][0] = s;
            s++;
        }
        for (int y = 1; y < n; y++) {
            array[m - 1][y] = s;
            s++;
        }
        for (int x = m - 2; x >= 0; x--) {
            array[x][n - 1] = s;
            s++;
        }
        for (int y = n - 2; y >= 1; y--) {
            array[0][y] = s;
            s++;
        }

        int c = 1;
        int d = 1;

        while (s < m * n) {

            while (array[c + 1][d] == 0) {
                array[c][d] = s;
                s++;
                c++;
            }

            while (array[c][d + 1] == 0) {
                array[c][d] = s;
                s++;
                d++;
            }


            while (array[c - 1][d] == 0) {
                array[c][d] = s;
                s++;
                c--;
            }


            while (array[c][d - 1] == 0) {
                array[c][d] = s;
                s++;
                d--;
            }

        }


        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] == 0) {
                    array[x][y] = s;
                }
            }
        }


        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                if (array[x][y] < 10) {

                    System.out.print(array[x][y] + ",  ");
                } else {
                    System.out.print(array[x][y] + ", ");
                }
            }
            System.out.println("");
        }
    }
}

