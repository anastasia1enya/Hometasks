package HibernateHW;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;


@Entity
@Table(name = "departments")
@Setter
@Getter
@ToString
@Accessors(chain = true)

public class Departments {

    @Id
    @GeneratedValue
    @Column(name = "idDepartments", unique = true)
    private Long idDepartments;

    @Column(name = "name")
    private String name;

    @Column(name = "headOfDeaprtment")
    private String headOfDeaprtment;


}
