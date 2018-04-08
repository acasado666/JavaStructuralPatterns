package org.acasado.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {
    public static void main(String[] args) {

        StudentClient client = new StudentClient();

        List<Student> students = client.getStudentList();

        System.out.println(students);
    }
}
