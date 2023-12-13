
public class Person {
    private String id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;

    public Person(String id, String name, int age, String address, String phoneNumber) {
        setId(id);
        setName(name);
        setAge(age);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString(){
        return "ID: " + this.getId() + "\n" +
                "Nombre: " + this.getName() + "\n" +
                "Edad: " + this.getAge() + "\n" +
                "Direccion: " + this.getAddress() + "\n" +
                "Telefono: " + this.getPhoneNumber() + "\n";
    }
}
