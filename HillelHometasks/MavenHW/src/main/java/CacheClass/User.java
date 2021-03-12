package CacheClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class User {
    int id;
    private String firstName;
    private String lastName;
    private int age;
    private String phone;
    private String email;

//    public User(int id, String firstName, String lastName, int age, String phone, String email) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age =age;
//        this.phone = phone;
//        this.email = email;
//    }
}
