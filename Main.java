import java.util.Scanner;


class Main {
    static int cnt = 1;
    static int arr[][] = new int[8][8];
    static int solve(int size, int a, int b, int rStart, int cStart) {
        if (size == 1) return 0;
        int half = size/2;
        int qr = (a - rStart)/half;
        int qc = (b - cStart)/half;
    
        // Get & mark 4 centers
        if (!(qr == 0 && qc == 0)){
            arr[rStart + half-1][cStart + half-1] = cnt;
        }
        if (!(qr == 0 && qc == 1)){
            arr[rStart + half-1][cStart + half] = cnt;
        }
        if(!(qr == 1 && qc == 0)){
            arr[rStart + half][cStart + half-1] = cnt;
        }
        if (!(qr == 1 && qc == 1)){
            arr[rStart + half][cStart + half] = cnt;
        }
        cnt++;
        if (!(qr == 0 && qc == 0)){
            solve(half, rStart + half-1, cStart + half-1, rStart, cStart);
        } else{
            solve(half, a, b, rStart, cStart);
        }
        if (!(qr == 0 && qc == 1)){
            solve(half, rStart + half-1, cStart + half, rStart, cStart+half);
        } else{
            solve(half, a, b, rStart, cStart + half);
        }
        if(!(qr == 1 && qc == 0)){
            solve(half, rStart + half, cStart + half-1, rStart + half, cStart);
        } else{
            solve(half, a, b, rStart + half, cStart);
        }
        if (!(qr == 1 && qc == 1)){
            solve(half, rStart + half, cStart + half, rStart + half, cStart + half);
        } else{
            solve(half, a, b, rStart + half, cStart + half);
        }
        return 0;
    
}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        arr[a][b] = -1;
        solve(size, a, b, 0, 0);
        for(int i=0; i<size; i++) {
            for(int j=0; j<size; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}