package rafie.belajar_java_dasar.TripleL;

public class PlaygroundNo1 {
    public static void main(String[] args) {
        String varA = "aku adalah seorang programmer java";
        String[] sortByArray = varA.split(" ");
        int totalVocal = 0;

        System.out.print("Hasil sort by array: ");
        for (int i = 0; i < sortByArray.length; i++) {
            System.out.print(sortByArray[i] + "[" + i + "]");
            if (i < sortByArray.length - 1 ){
                System.out.print(" ");
            }
        }

        for (char charVocal : varA.toCharArray()) {
            if (charVocal == 'a' || charVocal == 'i' || charVocal == 'u' || charVocal == 'e' || charVocal == 'o'){
                totalVocal++;
            }
        }

        System.out.println("\n");
        System.out.println("Vocal in total adalah: " + totalVocal);
    }
}
