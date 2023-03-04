//package lab12.MergeSort;
//
//public class Sort {
//    public int[] mergeArray(int[] arrayА, int[] arrayB) {
//
//        int[] arrayC = int[arrayA.length + arrayB.length];
//        int positionA = 0, positionB = 0;
//
//        for (int i = 0; i < arrayC.length; i++) {
//            if (positionA == arrayA.length) {
//                arrayC[i] = arrayB[i - positionB];
//                positionB++;
//            } else if (positionB == arrayB.length) {
//                arrayC[i] = arrayA[i - positionA];
//                positionA++;
//            } else if (arrayA[i - positionA] < arrayB[i - positionB]) {
//                arrayC[i] = arrayA[i - positionA];
//                positionB++;
//            } else {
//                arrayC[i] = arrayB[i - positionB];
//                positionA++;
//            }
//        }
//        return arrayC;
//    }
//}
//        System.out.println("Общий список оценок студентов в порядке убывания: ");
//                for (int i = 0; i < arrayC.length; i++) {
//        if (positionA == point1.length) {
//        arrayC[i] = point1[i - (positionB+1)];
//        positionB++;
//        } else if (positionB == point2.length) {
//        arrayC[i] = point2[i - (positionA+1)];
//        positionA++;
//        } else if (point1[i - positionA] < point2[i - positionB]) {
//        arrayC[i] = point1[i - positionA];
//        positionB++;
//        } else {
//        arrayC[i] = point2[i - positionB];
//        positionA++;
//        }
//        }
//        System.out.println(Arrays.toString(arrayC));

//package lab12.MergeSort;
//
//
//import java.util.Arrays;
//
//public class Test {
//    public static void main(String[] args) {
//        Student student1 = new Student("Vasiliy", 5);
//        Student student2 = new Student("Ilya", 3);
//        Student student3 = new Student("Ivan", 1);
//
//        Student student4 = new Student("Nikolay", 6);
//        Student student5 = new Student("Sergey", 4);
//        Student student6 = new Student("Mariya", 2);
//
//
//        int[] point1 = new int[]{student1.getPoints(), student2.getPoints(), student3.getPoints()};
//        int[] point2 = new int[]{student4.getPoints(), student5.getPoints(), student6.getPoints()};
//        System.out.println("Студенты из первой группы: " + Arrays.toString(point1));
//        System.out.println("Студенты из второй группы: " + Arrays.toString(point2));
//
//        Arrays.sort(point1);
//        Arrays.sort(point2);
//        int[] arrayC = new int[point1.length + point2.length];
//        int positionA = 0, positionB = 0;
//        for (int i = 0; i < arrayC.length; i++) {
//            if (point1[positionA] < point2[positionB]){
//                arrayC[i] = point1[positionA];
//                positionA++;
//            }
//            else{
//                arrayC[i] = point2[positionB];
//                positionB++;
//            }
//            if (positionA == point1.length){
//                arrayC[i] = point1[(point1.length-1)];
//                arrayC[i+1] = point2[(point2.length - 1)];
//                i = arrayC.length;
//            }
//            if(positionB == point2.length){
//                arrayC[i] = point2[(point2.length - 1)];
//                arrayC[i+1] = point1[(point1.length-1)];
//                i = arrayC.length;
//            }
//            System.out.println(Arrays.toString(arrayC));
//        }
//
//    }
//}
//
