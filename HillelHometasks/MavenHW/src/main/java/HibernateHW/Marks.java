package HibernateHW;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "marks")
@Setter
@Getter
@ToString
@Accessors(chain = true)

public class Marks {
    @Id
    @GeneratedValue
    @Column(name = "idMarks", unique = true)
    private Long idMarks;

    @Column(name = "subject")
    private Integer subject;

    @Column(name = "student")
    private Integer student;

    @Column(name="mark")
    private Integer mark;


    @OneToOne
    @JoinColumn(name = "student")
    private Integer studId;

    @OneToOne
    @JoinColumn(name = "subject")
    private Integer idSubjects;
}
