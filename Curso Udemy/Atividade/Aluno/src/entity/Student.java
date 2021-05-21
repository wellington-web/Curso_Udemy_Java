package entity;

public class Student {

    private String name;
    private Double firstNote;
    private Double secondNote;
    private Double thirdNote;

    public Student(){
    }

    public Student(String name, Double firstNote, Double secondNote, Double thirdNote) {
        this.name = name;
        this.firstNote = firstNote;
        this.secondNote = secondNote;
        this.thirdNote = thirdNote;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(Double firstNote) {
        this.firstNote = firstNote;
    }

    public Double getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(Double secondNote) {
        this.secondNote = secondNote;
    }

    public Double getThirdNote() {
        return thirdNote;
    }

    public void setThirdNote(Double thirdNote) {
        this.thirdNote = thirdNote;
    }

    public Double finalGrade() {
        return firstNote + secondNote + thirdNote;
    }

    public Double missingPoints() {
        return 60 - finalGrade();
    }

    public String toStringFinal(Student student) {
        return "Student's name: " + name + ", Final grade: " + String.format("%.2f", finalGrade());
    }

    public String toStringMissing(Student missing) {
        return "Missing points: "
                + missingPoints()
                + " points to pass";
    }
}