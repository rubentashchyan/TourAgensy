import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Data
@NoArgsConstructor
public class Client {
    private String clientID;
    private String name;
    private String email;
    private String phone;
    private  ArrayList <Booking> bookings;


    public Client(String clientID, String name, String email, String phone, ArrayList <Booking> bookings) {
        this.clientID = clientID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.bookings = bookings;
    }
}
