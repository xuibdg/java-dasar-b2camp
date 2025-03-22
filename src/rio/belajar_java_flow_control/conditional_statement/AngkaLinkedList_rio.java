package rio.belajar_java_flow_control.conditional_statement;

import java.util.LinkedList;

public class AngkaLinkedList_rio {
    public static void main(String[] args) {
        LinkedList<String> AngkaLinkedlist = new LinkedList<>();
        //sebuah wadah/tempat untuk menyimpan berupa teks/string yg lebih fleksibel & efisien

        AngkaLinkedlist.add("11");
        AngkaLinkedlist.addLast("12");
        AngkaLinkedlist.add("13");
        AngkaLinkedlist.add("14");
        AngkaLinkedlist.add("15");

        System.out.println(AngkaLinkedlist);
    }
}
// 4. Buatlah program yang menyimpan beberapa angka dalam LinkedList
// lalu mencetak elemen pertama dan terakhir