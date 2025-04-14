package jauhari.belajar_java_dasar.playground;

public class CustomerEncap {
    private Integer CustomerId;
    private String name;
    private Integer age;
    private String passportNumber;

    public CustomerEncap(Integer customerId, String name, Integer age, String passportNumber) {
        CustomerId = customerId;
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }
    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer customerId) {
        CustomerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    }
