package org.acasado.adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList() {

        List<Student> students = new ArrayList<>();

        Student studentFromDB = new StudentDB("1234", "John", "Wick", "john@wick.com");

        students.add(studentFromDB);

        //Will not work! This is where the adapter comes into play!

        //Student studentFromLdap = new StudentLdap("chewie", "Solo", "Han", "han@solo.com");

        StudentLDAP studentFromLDAP = new StudentLDAP("chewie", "Solo", "Han", "han@solo.com");

        students.add(new StudentAdapterLDAP(studentFromLDAP));

        StudentCSV studentFromCSV = new StudentCSV("567,Sherlock,Holmes,sherlock@holmes.com");

        students.add(new StudentAdapterCSV(studentFromCSV));

        return students;

    }
}
