import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class TourServiceTest {
    @Test
    public void parseAll() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourXMLParser parser = new TourXMLParser("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        List<Tour> tours = parser.parseAll();
        assertFalse(tours.isEmpty());
    }
}