import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sky.ClassList;
import org.sky.Student;

import java.util.ArrayList;
import java.util.List;

public class ClassListTests {

    private static ClassList myClass;
    private static List<Student> testData;

    @BeforeAll
    public static void Setup(){
        myClass = new ClassList();
        myClass.addStudent(new Student("David", 49, 61));
        myClass.addStudent(new Student("Andrew", 99, 21));
        myClass.addStudent(new Student("McCall", 89, 23));
        myClass.addStudent(new Student("Jon", 100, 16));
        myClass.addStudent(new Student("Hames", 32, 99));
        myClass.addStudent(new Student("Jough", 1, 14));

        testData = new ArrayList<Student>();
        myClass.getStudents().forEach(s -> testData.add(s));
//        testData.add(new Student("error", 1, 2));
    }

    @Test
    public void getStudents(){
        // When comparing objects. check that the .equals returns true
        Assertions.assertTrue(myClass.getStudents().equals(testData));
        Assertions.assertArrayEquals(myClass.getStudents().toArray(), testData.toArray());

        for (int i = 0; i < testData.size(); i++) {
            Assertions.assertTrue(myClass.getStudents().get(i).equals(testData.get(i)));
        }
    }

    @Test
    public void getCount(){
        Assertions.assertEquals(myClass.getCount(), testData.size());
    }

    @BeforeEach
    public void Example(){
        System.out.println("Before Each Test, this runs");
    }

}

