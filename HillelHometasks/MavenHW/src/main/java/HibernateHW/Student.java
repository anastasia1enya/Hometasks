package HibernateHW;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Setter
@Getter
@ToString
@Accessors(chain = true)

public class Student {

        @Id
        @GeneratedValue
        @Column(name = "studId", unique = true)
        private Long studId;

        @Column(name = "name_surname")
        private String name_surname;

        @Column(name = "group")
        private String group;

        @Column(name="yearOfEntering")
        private Integer yearOfEntering;

        @Override
        public String toString() {
                return "Student{" +
                        "studId=" + studId +
                        ", name_surname='" + name_surname + '\'' +
                        ", group='" + group + '\'' +
                        ", yearOfEntering=" + yearOfEntering +
                        '}';
        }


    }
