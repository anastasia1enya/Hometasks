package home.com.Lesson8;

public class Person {
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    private String fullName;
    private int age;
    private boolean retired;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (getAge() != person.getAge()) {
            return false;
        }
        if (isRetired() != person.isRetired()) {
            return false;
        }
        return getFullName() != null
                ? getFullName().equals(person.getFullName())
                : person.getFullName() == null;

    }
}
