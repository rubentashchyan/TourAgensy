import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClientXMLParserTest {
    @Test
    public void parseAll() throws IOException, ParserConfigurationException, ParseException, SAXException {
        ClientXMLParser parser = new ClientXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        List<Client> clients = parser.parseAll();
        assertFalse(clients.isEmpty());
    }
}