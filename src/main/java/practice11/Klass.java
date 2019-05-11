package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private Integer number;

    private Student leader;

    private List<Student> students;

    private Teacher teacher;

    public Klass(Integer number) {
        this.number = number;
        this.students = new ArrayList<>();
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public void appendMember(Student student) {
        students.add(student);
        student.setKlass(this);
        if(teacher != null) {
            System.out.print("I am " + teacher.getName() +
                    ". I know " + student.getName() +
                    " has joined Class " + getNumber() + ".\n");
        }
    }

    public boolean isIn(Student student) {
        return getNumber().equals(student.getKlass().getNumber());
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if(students.contains(leader)) {
            this.leader = leader;
            if(teacher != null) {
                System.out.print("I am " + teacher.getName() +
                        ". I know " + leader.getName() + " become Leader of Class "
                        + leader.getKlass().getNumber() + ".\n");
            }
        }else {
            System.out.print("It is not one of us.\n");
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}