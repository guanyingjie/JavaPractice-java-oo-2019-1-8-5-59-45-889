package practice08;

public class Person {
    private int id;
    private int age;
    private String name;
    public Person(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }
    @Override
    public boolean equals(Object obj){
        if(obj!=null){
            Person person=(Person)obj;
            return person.getId()==this.getId();
        }
        return false;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public String introduce(){
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
