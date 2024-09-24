import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class ClientService {

    private ClientXMLParser parser;

    public ClientService(ClientXMLParser parser) {
        this.parser = parser;
    }

    public Client findByName(String name) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Client> clients = parser.parseAll();
        for (Client client : clients) {
            if (clients.contains(name)) {
                return client;
            }
        }
        return null;
    }


    public Client findByID(String clientID) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Client> clients = parser.parseAll();
        for (Client client : clients) {
            if (clients.contains(clientID)) {
                return client;
            }
        }
        return null;
    }

    public Client findByPhone(String phone) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Client> clients = parser.parseAll();
        for (Client client : clients) {
            if (clients.contains(phone)) {
                return client;
            }
        }
        return null;
    }

    public Client findByEmail (String email) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Client> clients = parser.parseAll();
        for (Client client : clients) {
            if (clients.contains(email)) {
                return client;
            }
        }
        return null;
    }


}
