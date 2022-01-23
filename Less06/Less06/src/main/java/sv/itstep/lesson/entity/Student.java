package sv.itstep.lesson.entity;

import lombok.Data;

@Data

public class Student {

    private String firstName;
    private String lastName;
    private String groupName;

    public Student(String firstName, String lastName, String groupName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupName = groupName;
    }


}
