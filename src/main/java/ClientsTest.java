import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ClientsTest {
    @BeforeAll
    public static void parseAll() throws IOException, ParserConfigurationException, ParseException, SAXException, IOException, ParserConfigurationException, ParseException, SAXException {
            ClientXMLParser parser = new ClientXMLParser();
            List<Client> clients = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
            assertFalse(clients.isEmpty());
    }


    @Test
    public void FindbyEmail() throws ParserConfigurationException, IOException, ParseException, SAXException {
        ClientService service = new ClientService();
        Client client = service.findByEmail("john.smith@example.com");
        assertNotNull(client);
    }
    @ParameterizedTest
    @ValueSource(strings = { "John", "Cluade", "Paul" })
     public  void findbyname(String name) throws IOException, ParserConfigurationException, ParseException, SAXException {
        ClientService service = new  ClientService();
        Client client = service.findByName(name);
        assertNotNull(client);
    }
}
