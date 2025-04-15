package jauhari.belajar_java_dasar.HolidayTask;

//cari ada berapa huruf vokal
//cari ada berapa huruf konsonan
//kalikan jumlah vokal ke masing-maisng index
//kalikan jumlah konsonan ke masing-maisng index


public class Array {
    public static void main(String[] args) {

        String[] varA = {"aku adalah seorang programmer java"};
        String words = varA[0].toLowerCase();

        int totalVokal = 0;
        int totalKonsonan = 0;

        for (int i = 0; i < words.length(); i++) {
            char v = words.charAt(i);
            if (Character.isLetter(v)) {
                if (v == 'a' || v == 'i' || v == 'u' || v == 'e' || v == 'o') {
                    totalVokal++;
                } else {
                    totalKonsonan++;
                }
            }
        }
        System.out.println("Total vokal = " + totalVokal);
        System.out.println("Total konsonan = " + totalKonsonan);

        System.out.println("======================================");

//        String[] wordsArray = words.trim().split("\\s+");
//        int[] vokalKaliIndex = new int[wordsArray.length];
//        int[] konsonanKaliIndex = new int[wordsArray.length];
//
//        //System.out.println(Arrays.deepToString(words2));
//        int vokal = 0;
//        int konsonan = 0;
//
//        for (String words3 : words2){
//            int vokal = 0;
//            int konsonan = 0;
//        for (int i = 0; i < wordsArray.length(); i++){
//            String words3 = wordsArray[i];
//            int vokal = 0;
//            int konsonan = 0;
//
//            for (int j = 0; j < words3.length(); j++){
//                char v = words3.charAt(j);
//                if (Character.isLetter(v)) {
//                    if (v == 'a' || v == 'i' || v == 'u' || v == 'e' || v == 'o') {
//                        vokal++;
//                    } else {
//                        konsonan++;
//            }
//        }
//                vokalKaliIndex[i] = vokal * i;
//                konsonanKaliIndex[i] = konsonan * i;
//    }
//            System.out.println("Vokal x Indeks");
//            for (int v : vokalKaliIndex) {
//                System.out.println(v + " ");
//            }


}}







//        int totalVokal = 0;
//        int totalKonsonan = 0;
//
//        for (int i = 0; i < varA.length; i++){
//            String kata = varA[i].toLowerCase();
//            int vokal = 0;
//            int konsonan = 0;
//
//            for (int j = 0; j < kata.length(); j++){
//                char c = kata.charAt(j);
//
//                if (Character.isLetter(c))
//                    if (c == 'a' || c == 'i' || c == 'u' || c == 'e' ||c == 'o') {
//                        vokal++;
//                        totalVokal++;
//                    }else{
//                        konsonan++;
//                        totalKonsonan++;
//                    }
//            }
//
//            System.out.println("Total Huruf vokal= " + totalVokal);
//            System.out.println("Total Huruf konsonan= " + totalKonsonan);
//            //System.out.println("Kata ke-" + i + " (\"" + varA[i] + "\") → vokal: " + vokal + ", konsonan: " + konsonan);
//            //System.out.print("Huruf vokal per index: ");
//            System.out.println("Vokal per index" + (vokal * i));
//            //System.out.print("Huruf konsonan per index: ");
//            System.out.println( "Konsonan per index" + konsonan * i);
//            //System.out.print(vokal * i);
 //       }


//        System.out.println(varA[1]);
//
//        int vokal = 0;
//        int konsonan = 0;
//
//        for (int i = 0; i < varA.length(); i++){
//            char c = varA.charAt(i);
//        }
//
//
//
//
//
//


//        for (String item : varA){
//            System.out.println(item);
 //       }

//        List<String> varA = Arrays.asList( "aku", "adalah", "seorang", "programmer", "java");
//        for (String kata : varA){
//            int count = 0;
//            for (char c : varA.toArray()) {
//                if (c == 'a') {
//                    count++;
//                }
//            }

//        for (int vokal : varA){
//            int count = 0;
//            for (char c : vokal.toCharArray)
   //     }

//        String [] varA = {"aku", "adalah", "seorang", "programmer", "java"};
//        char [] vokal = {'a','i','u','e','o'};
//        System.out.print(Arrays.deepToString(varA));
  //      System.out.println(Arrays.deepToString(varA));

//        int jumlahVokal = Arrays.binarySearch(varA,vokal);;
//        Scanner scanner = new Scanner(System.in);





