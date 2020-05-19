import java.util.Objects;
import com.google.gson.Gson;

public class Person
{
    String Name;
    String Lastname;
    int Age;

    public Person(String name, String lastname, int age) {
        Name = name;
        Lastname = lastname;
        Age = age;
    }

    static public String Serialization (Person o)
    {
        Gson gson = new Gson();
        return gson.toJson(o);
    }

    static public Person Deserialization(String jsonString)
    {
        Gson gson= new Gson();
        return gson.fromJson(jsonString, Person.class);
    }
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Age == person.Age &&
                Objects.equals(Name, person.Name) &&
                Objects.equals(Lastname, person.Lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Lastname, Age);
    }
}