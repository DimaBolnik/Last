package Jakcon;

import java.util.Map;

public class Cat  {

    public String name;

    public int weight;

    public int age;

    public Map<String, String> properties;


    public Cat(String name, int weight, int age, Map<String, String> properties) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.properties = properties;
    }


    public Map<String, String> getProperties() {
        return properties;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public Cat() {}

    @Override
    public String toString() {
        return "Cat{" + "\n" +
                "name=" + name + ",\n" +
                "weight=" + weight +",\n" +
                "age=" + age +",\n" +
                "properties=" + properties +
                '}';
    }
}
