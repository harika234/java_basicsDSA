package SlidingWindow;

public class SpiralMatrix {
    public static void main(String[] args) {
        int A = 5;
        int[][] out = spiralmat(A); // Corrected the method invocation
        for (int i = 0; i < out.length; i++) {
            for (int j = 0; j < out[0].length; j++) {
                System.out.print(out[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static int[][] spiralmat(int A) {
        int i = 0;
        int j = 0;
        int elem = 1;
        int[][] spiralMatrix = new int[A][A];
        while (A > 1) {
            for (int k = 0; k < A - 1; k++) { // Changed the loop condition
                spiralMatrix[i][j] = elem++;
                j++;
            }
            for (int k = 0; k < A - 1; k++) { // Changed the loop condition
                spiralMatrix[i][j] = elem++;
                i++;
            }

            for (int k = 0; k < A - 1; k++) { // Changed the loop condition
                spiralMatrix[i][j] = elem++;
                j--;
            }

            for (int k = 0; k < A - 1; k++) { // Changed the loop condition
                spiralMatrix[i][j] = elem++;
                i--;
            }

            A = A - 2;
            i++;
            j++;
        }
        if (A == 1) {
            spiralMatrix[i][j] = elem;
        }
        return spiralMatrix;
    }
}
