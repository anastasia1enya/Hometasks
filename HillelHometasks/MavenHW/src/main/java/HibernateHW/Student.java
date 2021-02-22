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

        @Column(name = "'group'")
        private int group;

        public String getName_surname() {
                return name_surname;
        }

        public void setName_surname(String name_surname) {
                this.name_surname = name_surname;
        }

        public int getGroup() {
                return group;
        }

        public void setGroup(int group) {
                this.group = group;
        }

        public Integer getYearOfEntering() {
                return yearOfEntering;
        }

        public void setYearOfEntering(Integer yearOfEntering) {
                this.yearOfEntering = yearOfEntering;
        }

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
