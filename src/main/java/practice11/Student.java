package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age);
    }

    public Student(Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        if(klass.getLeader() == null) {
            return super.introduce() + " I am a Student. I am at Class " + klass.getNumber() + ".";
        }else {
            return super.introduce() + " I am a Student. I am Leader of Class " + klass.getNumber() + ".";
        }

    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }
}