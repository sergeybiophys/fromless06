package sv.itstep.lesson.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataBase {

    List<Student> students = new ArrayList<Student>(Arrays.asList(
            new Student("Vasya", "Pupkin","VPU911"),
            new Student("Lena", "Terkina","VPU911"),
            new Student("Kolya", "Fedin","VPU911")));

}
