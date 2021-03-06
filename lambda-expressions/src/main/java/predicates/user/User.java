package predicates.user;

/**
 * @author nakulgoyal
 *         09/08/20
 **/
public class User {
    private String name;
    private Integer age;
    
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "Name : " + this.getName() + ", Age : " + this.getAge();
    }
}


