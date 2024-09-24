import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    private String clientID;
    private String name;
    private String email;
    private String phone;
    private  ArrayList <Booking> bookings;
}
