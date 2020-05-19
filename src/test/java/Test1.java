import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

public class Test1
{
    @Test
    public void equals()
    {
        EqualsVerifier.forClass(Person.class).verify();
    }
}
