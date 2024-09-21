import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class TourService {

    TourXMLParser parser = new TourXMLParser();

    public Tour findById(String tourID) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Tour> tours = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        for (Tour tour : tours) {
            if (tours.contains(tourID)) {
                return tour;
            }
        }
        return null;
    }

    public Tour findByDestination(String destination) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Tour> tours = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        for (Tour tour : tours) {
            if (tours.contains(destination)) {
                return tour;
            }
        }
        return null;
    }

    public Tour findByDate(Date dateStart) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Tour> tours = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        for (Tour tour : tours) {
            if (tours.contains(dateStart)) {
                return tour;
            }
        }
        return null;
    }

    public Tour findByDate(Date dateStart, Date dateEnd) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Tour> tours = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        for (Tour tour : tours) {
            if (tours.contains(dateStart) && tours.contains(dateEnd)) {
                return tour;
            }
        }
        return null;
    }

    public Tour findByGuide(Guide guide) throws IOException, ParserConfigurationException, ParseException, SAXException {
        List<Tour> tours = parser.parseAll("C:\\Users\\modar\\OneDrive\\Рабочий стол\\travelAgency.xml");
        for (Tour tour : tours) {
            if (tours.contains(guide)) {
                return tour;
            }
        }
        return null;
    }



}