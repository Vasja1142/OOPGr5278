package Domain;

public class Teacher extends Worker{
    private String acadDegree;
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    @Override
    public String toString() {
        return "\n" + acadDegree + ": " +
                this.getName() + ", " + this.getAge()
                + " лет";
    }
}
