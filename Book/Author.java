public class Author {
    // Private attributes
    private String name;
    private char ser;
    private int age;

    // Public constructor to initialize the attributes
    public Author(String name, char ser, int age) {
        this.name = name;
        this.ser = ser;
        this.age = age;
    }

    // Public setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public getter for ser
    public char getSer() {
        return ser;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public method to display the details of the Author
    public void displayDetails() {
        System.out.println("Author Details:");
        System.out.println("Name: " + name);
        System.out.println("Ser: " + ser);
        System.out.println("Age: " + age);
    }

    }