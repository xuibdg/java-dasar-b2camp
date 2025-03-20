package rio.belajar_java_flow_control.conditional_statement;

import java.util.LinkedList;

public class AngkaLinkedList_rio {
    public static void main(String[] args) {
        LinkedList<String> AngkaLinkedlist = new LinkedList<>();
        AngkaLinkedlist.add("11");
        AngkaLinkedlist.add("13");
        AngkaLinkedlist.add("14");
        AngkaLinkedlist.add("15");

        AngkaLinkedlist.addLast("12");  //menjadi elemen/urutan terakhir
        System.out.println(AngkaLinkedlist);
    }
}
