public class Animal {
    private String id;
    private String name;
    private int age;
    private String skinType;
    private String eatingHabit;

    public Animal(){}

    public Animal(String id, String name, int age, String skinType, String eatingHabit) {
        setId(id);
        setName(name);
        setAge(age);
        setSkinType(skinType);
        setEatingHabit(eatingHabit);
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

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public String getEatingHabit() {
        return eatingHabit;
    }

    public void setEatingHabit(String eatingHabit) {
        this.eatingHabit = eatingHabit;
    }

    public void speak() {
        System.out.println("Hola, soy un animal");
    }
}
