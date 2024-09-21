import lombok.NoArgsConstructor;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.swing.text.html.CSS.getAttribute;

@NoArgsConstructor
public class ClientXMLParser implements AgencyFileHandler <Client> {

    @Override
    public List<Client> parseAll(String pathfile) throws ParserConfigurationException, IOException, SAXException, ParseException {
        List<Client> clients = new ArrayList<>();
        File file = new File(pathfile);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(file);
        NodeList nodeList = document.getDocumentElement().getElementsByTagName("client");
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node clientNode = nodeList.item(i);
            System.out.println(nodeList.item(i));
            if (clientNode.getNodeType() == Node.ELEMENT_NODE){
                Element clientElement = (Element)clientNode;
                String clientID = clientElement.getAttribute("id");
                String name = clientElement.getElementsByTagName("name").item(0).getTextContent();
                String email = clientElement.getElementsByTagName("email").item(0).getTextContent();
                String phone = clientElement.getElementsByTagName("phone").item(0).getTextContent();
                NodeList bookingNode = ((Element) clientNode).getElementsByTagName("booking");
                ArrayList <Booking> bookings = new ArrayList<>();
                SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-DD");
                for (int j = 0; j < nodeList.getLength(); j++) {
                    Element bookingElement = (Element) bookingNode.item(j);
                    String tourID = bookingElement.getAttribute("tourID");
                    Date date = dateFormat.parse(bookingElement.getAttribute("date"));
                    Booking booking = new Booking(tourID, date);
                    bookings.add(booking);
                }
               Client client = new Client(clientID, name, email, phone, bookings);
                clients.add(client);
            }
        }

        return new ArrayList<>();
    }

    @Override
    public void save(Client entity) {

    }

    @Override
    public void saveAll(List <Client> entities) {

    }
}
