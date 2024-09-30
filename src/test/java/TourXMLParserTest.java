import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TourXMLParserTest {

    @Test
    public void parseAllTest() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourXMLParser parser = new TourXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
         List<Tour> tours = parser.parseAll();
         assertFalse(tours.isEmpty());
    }

    @Test
    public void saveTourTest() throws IOException {
        Tour tour = new Tour("T003", "London Adventure", "England", 1500, 7,new Date(), new Date(), new Guide("G003", "James Bond", "English"));
       TourXMLParser parser = new TourXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        parser.save(tour);
        File file = new File("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        assertTrue(file.exists());

    }
}
