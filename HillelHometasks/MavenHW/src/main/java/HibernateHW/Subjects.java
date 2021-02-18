package HibernateHW;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "subjects")
@Setter
@Getter
@ToString
@Accessors(chain = true)

public class Subjects {
    @Id
    @GeneratedValue
    @Column(name = "idSubjects", unique = true)
    private Long idSubjects;

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private Integer teacher;

    @Column(name="term")
    private Integer term;

    @Column(name="year")
    private Integer year;

//    @OneToOne
//    @JoinColumn(name = "teacher")
//    private Integer idTeachers;;
}
