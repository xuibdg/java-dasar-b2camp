package hirlan.javaio;

public class AlphabetExample {
//    public static void main(String[] args) {
//        int height= 7;
//
//        for (int i=0; i<height; i++){
//            printA();
//        }
//    }
//    static void printA(){
//        String a[]={" 111 ","1   1","1   1","11111","1   1","1   1","1   1"};
//        System.out.println();
//    }
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
}


}
