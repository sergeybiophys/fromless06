package sv.itstep.lesson.servlet;

import sv.itstep.lesson.entity.Student;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class StudentServlet extends javax.servlet.http.HttpServlet {

    List<Student> students = new CopyOnWriteArrayList<>();

    @Override
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String groupname = request.getParameter("groupname");
        Student student = new Student(firstname, lastname, groupname);
        students.add(student);
        request.setAttribute("students", students);
        request.getRequestDispatcher("/WEB-INF/form/").forward(request, response);
    }

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.getRequestDispatcher("/...").forward(request, response);
    }

}
