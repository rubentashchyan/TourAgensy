import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface AgencyFileHandler <T> {
    public List<T> parseAll(String pathFile) throws ParserConfigurationException, IOException, SAXException, ParseException;
    public void save (T entity) throws IOException;
    public void saveAll( List<T> entities);
}
