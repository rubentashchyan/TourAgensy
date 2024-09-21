import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, ParseException, SAXException {

TourXMLParser parser = new TourXMLParser();
        System.out.println(parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml"));
        Tour entity =  new Tour("T001", "Berlin", "Germany", 1000, 7, new Date(2024, 07, 15), new Date(2024, 07, 22),  new Guide("G004", "German Gering", "German"));
        System.out.println(entity);
    }
}