package Lab20.Number5;

public class Matrix<T extends Number> {
    private T[][] data;

    public Matrix(T[][] data) {
        this.data = data;
    }

    public int getRows() {
        return data.length;
    }

    public int getCols() {
        return data[0].length;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (getRows() != other.getRows() || getCols() != other.getCols()) {
            throw new IllegalArgumentException("Matrices must have same dimensions");
        }
        T[][] result = createMatrix(getRows(), getCols());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                result[i][j] = add(data[i][j], other.data[i][j]);
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> multiply(Matrix<T> other) {
        if (getCols() != other.getRows()) {
            throw new IllegalArgumentException("Number of columns in first matrix must match number of rows in second matrix");
        }
        T[][] result = createMatrix(getRows(), other.getCols());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < other.getCols(); j++) {
                result[i][j] = multiplyRowAndCol(data[i], other.getColumn(j));
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<T> transpose() {
        T[][] result = createMatrix(getCols(), getRows());
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                result[j][i] = data[i][j];
            }
        }
        return new Matrix<>(result);
    }

    private T[][] createMatrix(int rows, int cols) {
        return (T[][]) new Number[rows][cols];
    }

    private T add(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        }
    }

    private T multiplyRowAndCol(T[] row, T[] col) {
        T result = createZero();
        for (int i = 0; i < row.length; i++) {
            result = add(result, multiply(row[i], col[i]));
        }
        return result;
    }


    private T[] getColumn(int colIndex) {
        T[] result = createRow(getRows());
        for (int i = 0; i < getRows(); i++) {
            result[i] = data[i][colIndex];
        }
        return result;
    }

    private T multiply(T a, T b) {
        if (a instanceof Double || b instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Float || b instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else if (a instanceof Long || b instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        }
    }

    private T createZero() {
        if (data[0][0] instanceof Double) {
            return (T) Double.valueOf(0);
        } else if (data[0][0] instanceof Float) {
            return (T) Float.valueOf(0);
        } else if (data[0][0] instanceof Long) {
            return (T) Long.valueOf(0);
        } else {
            return (T) Integer.valueOf(0);
        }
    }

    private T[] createRow(int length) {
        T[] result = (T[]) new Number[length];
        for (int i = 0; i < length; i++) {
            result[i] = createZero();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getRows(); i++) {
            for (int j = 0; j < getCols(); j++) {
                sb.append(data[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}