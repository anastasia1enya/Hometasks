package HibernateHW;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Entity
@Table(name = "groups")
@Setter
@Getter
@ToString
@Accessors(chain = true)

public class Groups {

    @Id
    @GeneratedValue
    @Column(name = "idGroups", unique = true)
    private Long idGroups;


    @Column(name = "`group`")
    private String group;

}
