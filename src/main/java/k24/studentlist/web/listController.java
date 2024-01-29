package k24.studentlist.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import k24.studentlist.model.student;


@Controller
public class listController {

    @GetMapping("hello")
    public String showStudents(Model model) {

        System.out.println("students...");

        List<student> students = new ArrayList<>();
        students.add(new student("Petri", "Perus"));
        students.add(new student("Janne", "Joku"));

        model.addAttribute("students", students);
        return ("studentlist");
    }
    

}
