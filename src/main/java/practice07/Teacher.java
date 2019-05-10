package practice07;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(String name,int age,Klass klass){
        super(name,age);
        this.klass=klass;
    }
    public void setKlass(Klass klass){
        this.klass=klass;
    }
    public Klass getKlass(){
        return klass;
    }
    public Teacher(String name ,int age){
        super(name,age);
    }
    public String introduce(){
        return  this.klass == null?
                "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.":
                super.introduce()+" I am a Teacher. I teach Class "+this.klass.getNumber()+".";
    }
    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == this.getKlass().getNumber())
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach " + student.getName() + ".";
        else

            return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach " + student.getName() + ".";
    }
}

