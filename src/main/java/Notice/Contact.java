package Notice;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliient;
    private String name;
    private String firstname;
    private String Lasttname;
    private String emailFromClient;
    private Long phoneFromClient;

}
