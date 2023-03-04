package Lab20.Number5;

public class Main {
    public static void main(String[] args) {

        Integer[][] matrixData1 = {{1, 2}, {3, 4}};
        Integer[][] matrixData2 = {{5, 6}, {7, 8}};
        Matrix<Integer> matrix1 = new Matrix<>(matrixData1);
        Matrix<Integer> matrix2 = new Matrix<>(matrixData2);

        Matrix<Integer> matrixSum = matrix1.add(matrix2);
        System.out.println("Matrix sum:");
        System.out.println(matrixSum);

        Matrix<Integer> matrixProduct = matrix1.multiply(matrix2);
        System.out.println("Matrix product:");
        System.out.println(matrixProduct);

        Matrix<Integer> matrixTransposed = matrix1.transpose();
        System.out.println("Transposed matrix:");
        System.out.println(matrixTransposed);
    }
}