import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tour {
    private String tourID;
    private String tourName;
    private String destination;
    private int price;
    private int duration;
    private Date dateStart;
    private Date dateEnd;
    private Guide guide;
}
