package practice11;

import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private List<Klass> classes;

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age);
    }


    public Teacher(Integer id, String name, Integer age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.stream().forEach(klass -> klass.setTeacher(this));
    }

    @Override
    public String introduce() {
        if(classes == null || classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else {
            String result = "";
            for (Klass klass:classes) {
                result += klass.getNumber() + ", ";
            }
            return super.introduce() + " I am a Teacher. I teach Class " +
                    result.substring(0, result.length() - 2) + ".";
        }
    }

    public boolean isTeaching(Student student) {
        List<Klass> result = classes.stream()
                .filter(klass -> klass.isIn(student))
                .collect(Collectors.toList());
        return result.size() > 0;
    }

    public String introduceWith(Student student) {
        if(isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public List<Klass> getClasses() {
        return classes;
    }

    public void setClasses(List<Klass> classes) {
        this.classes = classes;
    }
}