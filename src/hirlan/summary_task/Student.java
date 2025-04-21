package hirlan.summary_task;

public class Student {
    private String id;
    private String name;
    private int nilai;

    public Student(String id, String name, int nilai) {
        this.id = id;
        this.name = name;
        this.nilai = nilai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nilai=" + nilai +
                '}';
    }
}
