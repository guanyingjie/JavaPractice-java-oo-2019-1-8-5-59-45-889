package practice06;

public class Teacher extends Person{
    private Integer klass;
    public int getKlass(){
        return klass;
    }
    public void setKlass(Integer klass){
        this.klass=klass;
    }
    public Teacher(String name,int age,Integer klass){
        super(name,age);
        this.klass=klass;
    }
    public Teacher(String name,int age){
        super(name,age);
    }
    public String introduce(){
        if(this.klass==null)
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach No Class.";
        else
            return  super.introduce()+" I am a Teacher. I teach Class "+this.klass+".";
    }

}
