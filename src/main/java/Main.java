import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, ParseException, SAXException {

        TourXMLParser parser = new TourXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        System.out.println(parser.parseAll());
        Tour entity = new Tour("T001", "Berlin", "Germany", 1000, 7, new Date(2024, 07, 15), new Date(2024, 07, 22), new Guide("G004", "German Gering", "German"));
        ClientXMLParser clientXMLParser = new ClientXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        clientXMLParser.parseAll();
    }
}