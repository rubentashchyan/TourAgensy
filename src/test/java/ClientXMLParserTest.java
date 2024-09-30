import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientXMLParserTest {
    @Test
    public void parseAll() throws IOException, ParserConfigurationException, ParseException, SAXException {
        ClientXMLParser parser = new ClientXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        List<Client> clients = parser.parseAll();
        assertNotNull(clients);
    }
//    @Test
//    public void saveClientTest() throws IOException {
//        Client client = new Client("C003", "Alice Johnson", "alice.johnson@example.com", "+1122334455", Arrays.asList(
//                new Booking("T001", "2024-06-15"), new Booking("T003", "2024-09-20")
//        ));
//        ClientXMLParser parser = new ClientXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
//
//        parser.save(client);
//
//        File file = new File("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
//        assertTrue(file.exists());
//
//    }

}