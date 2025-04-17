package rafie.belajar_java_dasar.TripleL;

public class SoalNomor1 {
    public static void main(String[] args) {

        String varA = "aku adalah seorang programmer java";
        String[] letsSplit = varA.split(" ");
        int vocalInTotal = 0;
        int consonantInTotal = 0;

        System.out.println("SOAL NOMOR 1 POIN A (BERAPA HURUF VOCAL PER KALIMAT)");
        for (char vocalCounter : varA.toCharArray()){
            if (vocalCounter == 'a' || vocalCounter == 'i' || vocalCounter == 'u' || vocalCounter == 'e' || vocalCounter == 'o'){
                vocalInTotal++;
            }
        }
        System.out.println("Ada " + vocalInTotal);

        System.out.println("\n");
        System.out.println("SOAL NOMOR 1 POIN B (BERAPA HURUF KONSONAN PER KALIMAT)");
        for (char consonantCounter : varA.toCharArray()){
            if (Character.isLetter(consonantCounter) && consonantCounter != 'a' && consonantCounter != 'i' && consonantCounter != 'u' && consonantCounter != 'e' && consonantCounter != 'o'){
                consonantInTotal++;
            }
        }
        System.out.println("Ada "+ consonantInTotal);
        System.out.println("\n");

        System.out.println("SOAL NOMOR 1 POIN C (VOKAL)");
        StringBuilder vocalC = new StringBuilder();
        for (int i = 0; i < letsSplit.length; i++) {
            String word = letsSplit[i];
            int countVocal = 0;
            for (int j = 0; j < word.length(); j++) {
                char vocalCountersc = word.charAt(j);
                if (vocalCountersc == 'a' || vocalCountersc == 'i' || vocalCountersc == 'u' || vocalCountersc == 'e' || vocalCountersc == 'o') {
                    countVocal++;
                }
            }
            int hasilC = countVocal * i;
            vocalC.append(hasilC);
            if (i < letsSplit.length - 1) {
                vocalC.append(" ");
            }
        }
        System.out.println("Total: " + vocalC);

        System.out.println("\n");
        System.out.println("SOAL NOMOR 1 POIN D (KONSONAN)");
        StringBuilder vocalD = new StringBuilder();
        for (int i = 0; i < letsSplit.length; i++) {
            String word = letsSplit[i];
            int countVocal = 0;
            for (int j = 0; j < word.length(); j++) {
                char vocalCountersc = word.charAt(j);
                if (vocalCountersc != 'a' && vocalCountersc != 'i' && vocalCountersc != 'u' && vocalCountersc != 'e' && vocalCountersc != 'o') {
                    countVocal++;
                }
            }
            int hasilC = countVocal * i;
            vocalD.append(hasilC);
            if (i < letsSplit.length - 1) {
                vocalD.append(" ");
            }
        }
        System.out.println("Total: " + vocalD);
    }
    }
