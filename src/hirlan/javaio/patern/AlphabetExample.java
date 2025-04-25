package hirlan.javaio.patern;

public class AlphabetExample {

public static void main(String[] args) {
    int height = 5;

    for (int i = 0; i < height; i++) {
        for (int j = 0; j <= height; j++) {
            if (j == 0 || j == height || (i == height/2 && j <= height) ||
                    (i == 0 && j > 0 && j < height)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    int height2=7;
    String space="  ";
    for (int i=0; i<height2; i++){
        printH(i); System.out.print(space);
        printI(i); System.out.print(space);
        printR(i); System.out.print(space);
        printL(i); System.out.print(space);
        printA(i); System.out.print(space);
        printN(i); System.out.print(space);


//        printA(i); System.out.print(space);
//        printB(i); System.out.print(space);
//        printC(i); System.out.print(space);
//        printD(i); System.out.print(space);
//        printE(i); System.out.print(space);
//        printF(i); System.out.print(space);
//        printG(i); System.out.print(space);
//        printH(i); System.out.print(space);
//        printI(i); System.out.print(space);
//        printJ(i); System.out.print(space);
//        printK(i); System.out.print(space);
//        printL(i); System.out.print(space);
//        printM(i); System.out.print(space);
//        printN(i); System.out.print(space);
//        printO(i); System.out.print(space);
//        printP(i); System.out.print(space);
//        printQ(i); System.out.print(space);
//        printR(i); System.out.print(space);
//        printS(i); System.out.print(space);
//        printT(i); System.out.print(space);
//        printU(i); System.out.print(space);
//        printV(i); System.out.print(space);
//        printW(i); System.out.print(space);
//        printX(i); System.out.print(space);
//        printY(i); System.out.print(space);
//        printZ(i);
        System.out.println();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
    static void printLine(String s) {
        System.out.print(s.replace("1", "0").replace(" ", "-"));//.replace("0", " "));
//        try {
//            Thread.sleep(50);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    static void printA(int i) {
        String[] data = {" 111 ", "1   1", "1   1", "11111", "1   1", "1   1", "1   1"};
        printLine(data[i]);
    }

    static void printB(int i) {
        String[] data = {"1111 ", "1   1", "1   1", "1111 ", "1   1", "1   1", "1111 "};
        printLine(data[i]);
    }

    static void printC(int i) {
        String[] data = {" 1111", "1    ", "1    ", "1    ", "1    ", "1    ", " 1111"};
        printLine(data[i]);
    }

    static void printD(int i) {
        String[] data = {"1111 ", "1   1", "1   1", "1   1", "1   1", "1   1", "1111 "};
        printLine(data[i]);
    }

    static void printE(int i) {
        String[] data = {"11111", "1    ", "1    ", "1111 ", "1    ", "1    ", "11111"};
        printLine(data[i]);
    }

    static void printF(int i) {
        String[] data = {"11111", "1    ", "1    ", "1111 ", "1    ", "1    ", "1    "};
        printLine(data[i]);
    }

    static void printG(int i) {
        String[] data = {" 1111", "1    ", "1    ", "1 111", "1   1", "1   1", " 1111"};
        printLine(data[i]);
    }

    static void printH(int i) {
        String[] data = {"1   1", "1   1", "1   1", "11111", "1   1", "1   1", "1   1"};
        printLine(data[i]);
    }

    static void printI(int i) {
        String[] data = {"11111", "  1  ", "  1  ", "  1  ", "  1  ", "  1  ", "11111"};
        printLine(data[i]);
    }

    static void printJ(int i) {
        String[] data = {" 1111", "   1 ", "   1 ", "   1 ", "   1 ", "1  1 ", " 11  "};
        printLine(data[i]);
    }

    static void printK(int i) {
        String[] data = {"1   1", "1  1 ", "1 1  ", "11   ", "1 1  ", "1  1 ", "1   1"};
        printLine(data[i]);
    }

    static void printL(int i) {
        String[] data = {"1    ", "1    ", "1    ", "1    ", "1    ", "1    ", "11111"};
        printLine(data[i]);
    }

    static void printM(int i) {
        String[] data = {"1   1", "11 11", "1 1 1", "1   1", "1   1", "1   1", "1   1"};
        printLine(data[i]);
    }

    static void printN(int i) {
        String[] data = {"1   1", "11  1", "1 1 1", "1  11", "1   1", "1   1", "1   1"};
        printLine(data[i]);
    }

    static void printO(int i) {
        String[] data = {" 111 ", "1   1", "1   1", "1   1", "1   1", "1   1", " 111 "};
        printLine(data[i]);
    }

    static void printP(int i) {
        String[] data = {"1111 ", "1   1", "1   1", "1111 ", "1    ", "1    ", "1    "};
        printLine(data[i]);
    }

    static void printQ(int i) {
        String[] data = {" 111 ", "1   1", "1   1", "1   1", "1 1 1", "1  1 ", " 11 1"};
        printLine(data[i]);
    }

    static void printR(int i) {
        String[] data = {"1111 ", "1   1", "1   1", "1111 ", "1 1  ", "1  1 ", "1   1"};
        printLine(data[i]);
    }

    static void printS(int i) {
        String[] data = {" 1111", "1    ", "1    ", " 111 ", "    1", "    1", "1111 "};
        printLine(data[i]);
    }

    static void printT(int i) {
        String[] data = {"11111", "  1  ", "  1  ", "  1  ", "  1  ", "  1  ", "  1  "};
        printLine(data[i]);
    }

    static void printU(int i) {
        String[] data = {"1   1", "1   1", "1   1", "1   1", "1   1", "1   1", " 111 "};
        printLine(data[i]);
    }

    static void printV(int i) {
        String[] data = {"1   1", "1   1", "1   1", "1   1", " 1 1 ", " 1 1 ", "  1  "};
        printLine(data[i]);
    }

    static void printW(int i) {
        String[] data = {"1   1", "1   1", "1   1", "1   1", "1 1 1", "11 11", "1   1"};
        printLine(data[i]);
    }

    static void printX(int i) {
        String[] data = {"1   1", "1   1", " 1 1 ", "  1  ", " 1 1 ", "1   1", "1   1"};
        printLine(data[i]);
    }

    static void printY(int i) {
        String[] data = {"1   1", "1   1", " 1 1 ", "  1  ", "  1  ", "  1  ", "  1  "};
        printLine(data[i]);
    }

    static void printZ(int i) {
        String[] data = {"11111", "   1 ", "  1  ", " 1   ", "1    ", "1    ", "11111"};
        printLine(data[i]);
    }


}
