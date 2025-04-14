package Revi.Belajar_Java_Dasar;

public class CustomerEncap {
    public class CustomerEncap {
        private int customerId;
        private String name;
        private int age;
        private String passportNumber;

        public CustomerEncap() {
        }

        public CustomerEncap(int customerId, String name, int age, String passportNumber) {
            this.customerId = customerId;
            this.name = name;
            this.age = age;
            this.passportNumber = passportNumber;
            System.out.println("Menampilkan data karyawan");}

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPassportNumber(String passportNumber) {
            this.passportNumber = passportNumber;
        }


        public int getCustomerId() {
            return customerId;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getPassportNumber() {
            return passportNumber;
        }
    }
