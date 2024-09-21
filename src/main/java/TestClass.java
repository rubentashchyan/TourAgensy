import org.junit.Before;
import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class TestClass {



    @Test
    public void parseAll() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourXMLParser parser = new TourXMLParser();
        List <Tour> tours = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        assertFalse(tours.isEmpty());
    }



}
