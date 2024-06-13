package XML;



import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.StringWriter;
import java.util.Map;

public class JAXBDemo {
    public static void main(String[] args) throws JAXBException {
        //создание объекта для сериализации в XML
        Dog cat = new Dog();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        //писать результат сериализации будем в Writer(StringWriter)
        StringWriter writer = new StringWriter();
        
        JAXBContext context = JAXBContext.newInstance(Dog.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // сама сериализация
        marshaller.marshal(cat, writer);

        //преобразовываем в строку все записанное в StringWriter
        String result = writer.toString();
        System.out.println(result);
    }
}

@XmlType(name = "Dog")
@XmlRootElement
class Dog {

    public String name;

    public int weight;

    public int age;

    public Map<String, String> properties;


    public Dog(String name, int weight, int age, Map<String, String> properties) {
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

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" + "\n" +
                "name=" + name + ",\n" +
                "weight=" + weight + ",\n" +
                "age=" + age + ",\n" +
                "properties=" + properties +
                '}';
    }
}
