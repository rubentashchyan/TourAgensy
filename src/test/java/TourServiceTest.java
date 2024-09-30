import org.junit.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class TourServiceTest {
    @Test
    public void findByIdTest() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourService service = new TourService(new TourXMLParser("C:\\path\\to\\travelAgency.xml"));
        Tour tour = service.findById("1");
        assertNotNull(tour);
    }

    @Test
    public void findByDestinationTest() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourService service = new TourService(new TourXMLParser("C:\\path\\to\\travelAgency.xml"));
        Tour tour = service.findByDestination("Paris");
        assertNotNull(tour);
    }

    @Test
    public void findByDateTest() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourService service = new TourService(new TourXMLParser("C:\\path\\to\\travelAgency.xml"));
        Date testDate = new Date();  // Можно указать конкретную тестовую дату, если известно
        Tour tour = service.findByDate(testDate);
        assertNotNull(tour);
    }

    @Test
    public void findByDateRangeTest() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourService service = new TourService( new TourXMLParser("C:\\path\\to\\travelAgency.xml"));

        Date dateStart = new Date();
        Date dateEnd = new Date();
        Tour tour = service.findByDate(dateStart, dateEnd);
        assertNotNull(tour);
    }

    @Test
    public void findByGuideTest() throws IOException, ParserConfigurationException, ParseException, SAXException {
        TourService service = new TourService(new TourXMLParser("C:\\path\\to\\travelAgency.xml"));
        Guide guide = new Guide("G001", "Jean Dupont", "French");
        Tour tour = service.findByGuide(guide);
        assertNotNull(tour);
    }
}