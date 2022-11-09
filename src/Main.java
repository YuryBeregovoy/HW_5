import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {

//        1
//        Необходимо реализовать программу, которая будет считывать
//        строки, введенные пользователем и выводить их в консоль.
//
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter any string:");
            String A = in.next();
                System.out.println("You enter string: " + A);
            }
    }


//        2
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. После чего программа выведет среднее из всех
//        введенных значений.
//
//     public static void main(String[] args) throws Exception {
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         int sum = 0;
//         int count = 0;
//         try {
//         String line = reader.readLine();
//             while (!line.equals("stop")) {
//                 sum = sum + Integer.parseInt(line);
//                 count++;
//                 line = reader.readLine();
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 reader.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//             System.out.println("");
//             System.out.println("Sum: " + sum);
//             System.out.println("Count: " + count);
//             System.out.println("Result: " + (sum / count));
//         }
//     }


//        3
//        Необходимо реализовать программу, которая будет считывать
//        числа, введенные пользователем, пока пользователь не введет
//        "stop" слово. по команде "status" необходимо вывести введенные
//        цифры в отсортированном виде.
//
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List arrayList = new ArrayList();
//        try {
//            String line = reader.readLine();
//            while (!line.equals("stop")) {
//                if (line.equals("status")) {
//                    Collections.sort(arrayList);
//                    int i = 0;
//                    for (Object n : arrayList) {
//                        System.out.println("Number " + ++i + ": " + n);
//                    }
//                    line = reader.readLine();
////  Команду "status" можно применить в любой момент работы программы, неограниченное количество раз!
//                }
//                arrayList.add(Integer.parseInt(line));
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }



//      4
//      Необходимо реализовать программу "калькулятор".
//      Поддерживаемые операции +-/* выбор операции и ввод данных
//      осуществляется пользователем с клавиатуры.

//    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        double n1;
//        char op;
//        double n2;
//        String operator;
//
//        try {
//            System.out.print("Enter 1st number: ");
//            String num1 = reader.readLine();
//            n1 = Integer.parseInt(num1);
//
//            System.out.print("Enter one operator +,  -,  *,  / :");
//
//            operator = reader.readLine();
//            op = 0;
//            if (operator.length() == 1) {
//                op = operator.charAt(0);
//                if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
//                    System.err.println("Invalid Operator. Use only +, -, *, /. Try again!");
//                    return;
//                }
//            } else {
//                if (operator.length() != 1) {
//                    System.err.println("Invalid Operator. Too many symbols. Try again!");
//                    return;
//                }
//            }
//            System.out.print("Enter 2nd number: ");
//            String num2 = reader.readLine();
//            n2 = Integer.parseInt(num2);
//
//        } catch (IOException | NumberFormatException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if (n2 == 0 && op == '/') {
//            System.err.println("Division by zero. Try again!");
//
//        } else if (op == '+') {
//            double sum = 0;
//            sum = n1 + n2;
//            System.out.println(" (+) Sum: " + sum);
//
//        } else if (op == '-') {
//            double diff = 0;
//            diff = n1 - n2;
//            System.out.println(" (-) Difference: " + diff);
//
//        } else if (op == '*') {
//            double multi = 0;
//            multi = n1 * n2;
//            System.out.println(" (*) Multiplication: " + multi);
//
//        } else if (op == '/') {
//            double div = 0;
//            div = n1 / n2;
//
//            System.out.println(" (/) Division: " + div);
//        } else {
//
//            System.err.println("Error. Try Again!");
//        }
//    }


//    5
//    Необходимо написать программу по умножению двух матриц.
//    Пользователь вводит матрицы с клавиатуры.

//    public static void main(String[] args) {
//        int iA, jA, iB, jB;
//        int[][] MatrixA;
//        int[][] MatrixB;
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
////Матрицы A и B могут быть перемножены, если число столбцов матрицы A равно числу строк матрицы B:
//        try {
//            System.out.print("Input number of rows (MatrixA): ");
//            iA = Integer.parseInt(reader.readLine());
//            System.out.print("Input number of columns (MatrixA) / rows (MatrixB): ");
//            jA = iB = Integer.parseInt(reader.readLine());
//            System.out.print("Input number of columns (MatrixB): ");
//            jB = Integer.parseInt(reader.readLine());
//
//            MatrixA = new int[iA][jA];
//            MatrixB = new int[iB][jB];
//
//            for (int i = 0; i < MatrixA.length; i++) {
//                for (int j = 0; j < MatrixA[i].length; j++) {
//                    System.out.print("Input element of MatrixA [" + i + "][" + j + "]:");
//                    MatrixA[i][j] = Integer.parseInt(reader.readLine());
//                }
//            }
//
//            for (int i = 0; i < MatrixB.length; i++) {
//                for (int j = 0; j < MatrixB[i].length; j++) {
//                    System.out.print("Input element of MatrixB [" + i + "][" + j + "]:");
//                    MatrixB[i][j] = Integer.parseInt(reader.readLine());
//                }
//            }
//
//        } catch (NumberFormatException | IOException e) {
//            throw new RuntimeException(e);
//
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
////Произведением матрицы A размером [i][j] на матрицу B размером [j][i] будет матрица C размером [j][j]:
//        int iC = MatrixA.length;
//        int jC = MatrixB[0].length;
//        int o = MatrixB.length;
//        int[][] MatrixC = new int[iC][jC];
//
////элемент ij матрицы C равен сумме произведений элементов i-ой строки матрицы A на соответствующие элементы j-ого столбца матрицы B:
//        for (int i = 0; i < iC; i++) {
//            for (int j = 0; j < jC; j++) {
//                for (int k = 0; k < o; k++) {
//                    MatrixC[i][j] += MatrixA[i][k] * MatrixB[k][j];
//                }
//            }
//        }
//        System.out.println("Matrix A:");
//        for (int[] subArrayA : MatrixA) {
//            for (int element : subArrayA) {
//                System.out.print(element + "  ");
//            }
//            System.out.println("");
//        }
//        System.out.println("Matrix B:");
//        for (int[] subArrayB : MatrixB) {
//            for (int element : subArrayB) {
//                System.out.print(element + "  ");
//            }
//            System.out.println("");
//        }
//
//        System.out.println("Matrix multiplication:");
//        for (int[] subArrayC : MatrixC) {
//            for (int element : subArrayC) {
//                System.out.print(element + "  ");
//            }
//            System.out.println("");
//        }
//    }


//      6
//    Задача #5, но матрицы необходимо считывать из файла (INPUT).

//    public static void main(String[] args) {
//        try {
//            int aRow, aColumn, bRow, bColumn;
//            int[][] matrixA;
//            int[][] matrixB;
//
//            BufferedReader buf = new BufferedReader(new FileReader("src/input_6"));
//            String[] reader = buf.readLine().split("\\s+");
//
//            aRow = Integer.parseInt(reader[0]);
//            aColumn = Integer.parseInt(reader[1]);
//            System.out.println(aRow + " " + aColumn);
//
//            bRow = Integer.parseInt(reader[2]);
//            bColumn = Integer.parseInt(reader[3]);
//            System.out.println("MatrixA size: [" + aRow + "] [" + aColumn +
//                    "]\nMatrixB size: [" + bRow + "] [" + bColumn + "]");
//
//            matrixA = new int[aRow][aColumn];
//            matrixB = new int[bRow][bColumn];
//
//            String str = "";
//            int cnt = 0, row = 0;
//            while (buf.ready()) {
//                str = buf.readLine();
//                if (str.length() > 2) {
//                    reader = str.split("\\s+");
//                    for (int c = 0; c < aColumn && cnt == 1; c++)
//                        matrixA[row][c] = Integer.parseInt(reader[c]);
//                    for (int c = 0; c < bColumn && cnt == 2; c++)
//                        matrixB[row][c] = Integer.parseInt(reader[c]);
//                    row++;
//                } else {
//                    cnt++;
//                    row = 0;
//                }
//            }
//            buf.close();
//
////Произведением матрицы A размером [i][j] на матрицу B размером [j][i] будет матрица C размером [j][j]:
//            int iC = matrixA.length;
//            int jC = matrixB[0].length;
//            int o = matrixB.length;
//            int[][] matrixC = new int[iC][jC];
//
////элемент ij матрицы C равен сумме произведений элементов i-ой строки матрицы A на соответствующие элементы j-ого столбца матрицы B:
//            for (int i = 0; i < iC; i++) {
//                for (int j = 0; j < jC; j++) {
//                    for (int k = 0; k < o; k++) {
//                        matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
//                    }
//                }
//            }
//
//            System.out.println("Matrix A:");
//            for (int[] subArrayA : matrixA) {
//                for (int element : subArrayA) {
//                    System.out.print(element + "  ");
//                }
//                System.out.println("");
//            }
//            System.out.println("Matrix B:");
//            for (int[] subArrayB : matrixB) {
//                for (int element : subArrayB) {
//                    System.out.print(element + "  ");
//                }
//                System.out.println("");
//            }
//
//            System.out.println("Matrix multiplication:");
//            for (int[] subArrayC : matrixC) {
//                for (int element : subArrayC) {
//                    System.out.print(element + "  ");
//                }
//                System.out.println("");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//      7
//    Прочитать файл (INPUT), в выходной файл (OUTPUT) записать все
//    строки из первого, но в обратном порядке (первая строка должна быть последней).

//    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader("src/input_6"))) {
//            String buf;
//            while ((buf = reader.readLine()) != null) {
//                strings.add(buf);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/output_7"))) {
//            for (int i = strings.size() - 1; i > -1; i--) {
//                writer.write(strings.get(i));
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


//      8
//    Имеется два файла (INPUT_1 и INPUT_2). В третий (OUTPUT) необходимо
//    записать только те строки, которые есть и в первом, и во втором.

//        public static void main(String[] args) {
//        try {
//            String first;
//            String second;
//
//            BufferedReader firstBr = new BufferedReader(new FileReader("src/input_8.1"));
//            BufferedReader secondBr = new BufferedReader(new FileReader("src/input_8.2"));
//            BufferedWriter outputBw = new BufferedWriter(new FileWriter("src/output_8.1"));
//
//            ArrayList<String> strings = new ArrayList<String>();
//
//            while ((first = firstBr.readLine()) != null) {
//                strings.add(first);
//            }
//            firstBr.close();
//            while ((second = secondBr.readLine()) != null) {
//                if (strings.contains(second)) {
//                    System.out.println(second);
//                    outputBw.write(second + "\n");
//                }
//            }
//            secondBr.close();
//            outputBw.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }


//            9 + 10
//    Создать класс коробка. Создать 5 объектов. Сериализовать их в файл.
//
//    Десериализовать объекты из задания #9. Отсортировать их по объёму.
//    Вывести на экран. Записать в файл (OUTPUT) самый большой объем.

//    public static void main(String[] args) throws RuntimeException {
//
//        Box[] boxes = Box.createArrayBoxes(5);
//
//        System.out.println("Boxes: " + Arrays.toString(boxes));
//        try {
//            FileOutputStream fos = new FileOutputStream
//                    ("src/output_9");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(boxes);
//            oos.close();
//
//
//            FileInputStream fis = new FileInputStream
//                    ("src/output_9");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Box[] boxes2 = (Box[]) ois.readObject();
//            ois.close();
//
//            System.out.println("Read from file: " + Arrays.toString(boxes2));
//
//            int[] volumesArray = new int[boxes2.length];
//            for (int i = 0; i < volumesArray.length; i++) {
//                volumesArray[i] = boxes2[i].getVolume();
//                System.out.println("Box volume: " + volumesArray[i]);
//            }
//
//            Arrays.sort(volumesArray);
//            System.out.println("Sort by volume: " + Arrays.toString(volumesArray));
//            int maxVolume = volumesArray[volumesArray.length - 1];
//            System.out.println("Max volume: " + maxVolume);
//
//            BufferedWriter maxVolumeWriter = null;
//            try {
//                maxVolumeWriter = new BufferedWriter(new FileWriter("src/output_10"));
//                maxVolumeWriter.write(maxVolume + "");
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    maxVolumeWriter.close();
//                } catch (FileNotFoundException e) {
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        } catch (ClassNotFoundException | IOException e) {
//            throw new RuntimeException(e);
//        }
//    }



}