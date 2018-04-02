package mesfinproject.weektwofirststproj;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showperson(Model model){
        Person person = new Person();
        person.setFirstName("Mesfin" );
        person.setLastName("Admassu");
        person.setPhoneNumber("2345678909");
        person.setEmail("sirahbizu");

        model.addAttribute("Myperson", person);
                return"friend";


    }

}
