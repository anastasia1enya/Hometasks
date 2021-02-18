package HibernateHW;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
@Setter
@Getter
@ToString
@Accessors(chain = true)


public class Teachers {

    @Id
    @GeneratedValue
    @Column(name = "idTeachers", unique = true)
    private Long idTeachers;

    @Column(name = "name_surname")
    private String name_surname;

    @Column(name = "department")
    private Integer department;


//    @OneToOne
//    @JoinColumn(name = "department")
//    private Integer idDepartments;

}
