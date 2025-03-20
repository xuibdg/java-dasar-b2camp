package fauzi.java_flow_control.conditional_statement;

public class LearnLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("iterasi : " + i);
        }

        System.out.println("______________________________________ while");
        int i = 0;
        while (i < 5){
            System.out.println("perulangan ke : " + i);
            i++;
        }

        System.out.println("______________________________________ do while");
        do {
            System.out.println("perulangan ke : " + i);
            i++;
        }while (i < 5);




    }
}
