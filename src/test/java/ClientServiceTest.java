import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;

import static org.junit.Assert.assertNotNull;

/**
 * TODO:
 * Тесты должны покрывать практически каждый метод тестируемого класса.
 * Название каждого метода теста должна включать слово "Test" (Не findbyname, а findByNameTest)
 * Тестовые классы должны быть реализованы для каждого сервиса и каждого парсера.
 * */

public class ClientServiceTest {

    @Test
    public void FindbyEmail() throws ParserConfigurationException, IOException, ParseException, SAXException {
        ClientService service = new ClientService(new ClientXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml"));
        Client client = service.findByEmail("john.smith@example.com");
        assertNotNull(client);
    }
    @ParameterizedTest
    @ValueSource(strings = { "John", "Cluade", "Paul" })
    public  void findbyname(String name) throws IOException, ParserConfigurationException, ParseException, SAXException {
        ClientService service = new  ClientService(new ClientXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml"));
        Client client = service.findByName(name);
        assertNotNull(client);
    }
}