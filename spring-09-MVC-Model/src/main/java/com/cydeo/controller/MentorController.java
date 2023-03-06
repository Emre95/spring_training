package com.cydeo.controller;

import com.cydeo.model.Gender;
import com.cydeo.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MentorController {

    @RequestMapping("/list")
    public String homePage(Model model) {

        Mentor mentor1 = new Mentor("Emre", "Yesilkaya", 28, Gender.MALE);
        Mentor mentor2 = new Mentor("Nur", "Vural", 30, Gender.FEMALE);
        Mentor mentor3 = new Mentor("Buse", "Gurbuz", 30, Gender.FEMALE);

        model.addAttribute("firstName1", mentor1.getFirstName());
        model.addAttribute("lastName1", mentor1.getLastName());
        model.addAttribute("age1", mentor1.getAge());
        model.addAttribute("gender1", mentor1.getGender());
        model.addAttribute("firstName2", mentor2.getFirstName());
        model.addAttribute("lastName2", mentor2.getLastName());
        model.addAttribute("age2", mentor2.getAge());
        model.addAttribute("gender2", mentor2.getGender());
        model.addAttribute("firstName3", mentor3.getFirstName());
        model.addAttribute("lastName3", mentor3.getLastName());
        model.addAttribute("age3", mentor3.getAge());
        model.addAttribute("gender3", mentor3.getGender());

        return "mentor/list";
    }

}
