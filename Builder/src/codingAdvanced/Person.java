package codingAdvanced;

public class Person {
    private String fName;
    private String lName;
    private String id;
    private int age;


    public Person(String fName, String lName, String id, int age) {
        this.fName = fName;
        this.lName = lName;
        this.id = id;
        this.age = age;

    }

    public Person() {
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        return "Full name: " + getfName() + " " + getlName() + " ID Number: " + getId() +
                " " + "and " + getAge() + " years old.";
    }
}
