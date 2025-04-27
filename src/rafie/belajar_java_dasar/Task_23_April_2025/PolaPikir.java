package rafie.belajar_java_dasar.Task_23_April_2025;

public class PolaPikir {
    public static void main(String[] args) {
        int tinggi = 7;

        for (int i = 0; i < tinggi; i++) {
            printA(i); System.out.print("  ");
            printB(i);
            System.out.print("  ");
            System.out.println();
        }
    }

    static void firstTemplate(String s){
        System.out.print(s.replace("a", "O"));
    }

    static void printA(int i) {
        String[] aTemplate = {" aaa ", "a   a", "a   a", "aaaaa", "a   a", "a   a", "a   a"};
        firstTemplate(aTemplate[i]);
    }

    static void printB(int i) {
        String[] bTemplate = {"aaaa ", "a   a", "a   a", "aaaa ", "a   a", "a   a", "aaaa "};
        firstTemplate(bTemplate[i]);
    }
}

