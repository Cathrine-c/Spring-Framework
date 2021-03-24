package Jiulie;

public class Duck3 {

    private String name;
    private Integer age;
    private Duck3 next;

    public Duck3 getNext(){
        return next;
    }

    public void setNext(Duck3 next) {
        this.next = next;
    }

    public Duck3(String n, Integer a) {
        this.name = n;
        this.age = a;
    }

    @Override
    public String toString() {
        return "Duck2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}


