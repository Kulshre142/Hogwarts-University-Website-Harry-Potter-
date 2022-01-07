package com.hogwarts.institute.Controller;


import com.hogwarts.institute.Model.ContactUs;
import com.hogwarts.institute.Model.NewsletterSubscriber;
import com.hogwarts.institute.Model.Student;
import com.hogwarts.institute.Service.AdmissionService;
import com.hogwarts.institute.Service.ContactUsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "*")
public class HogwartsController {

    @Autowired
    private ContactUsService contactUsService;

    @Autowired
    private AdmissionService admissionService;


    @GetMapping(value = "/")
    public String redirectToHome(){
        return "redirect:/home";
    }

    @GetMapping(value = "/home")
    public String showHomePage(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "home";
    }

    @PostMapping(value = "/home/subscribe")
    public String subscribeToNewsLetterFromHome(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        contactUsService.addSubscriber(subscriber);
        return "redirect:/home";
    }

    /********************************** CONTACT US ************************************/

    @GetMapping(value = "/contact-us")
    public String showContactUs(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        model.addAttribute("enquiry", new ContactUs());
        return "contactus";
    }

    @PostMapping(value = "/newEnquiry")
    public String addEnquiry( @ModelAttribute("enquiry") ContactUs contactUs){
        contactUsService.addEnquiry(contactUs);
        return "redirect:/contact-us";
    }

    @PostMapping(value = "/contact-us/subscribe")
    public String subscribeToNewsLetterFromContactUs(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/contact-us";
    }

    /********************************** ABOUT US *************************************/

    @GetMapping(value = "/about-us")
    public String showAboutUs(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "about";
    }

    @PostMapping(value = "/about-us/subscribe")
    public String subscribeToNewsLetterFromAboutUs(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/about-us";
    }


    /********************************** NEWS *************************************/

    @GetMapping(value = "/news")
    public String showNewsPage(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "news";
    }

    @PostMapping(value = "/news/subscribe")
    public String subscribeToNewsLetterFromNews(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/news";
    }

    /********************************DEPARTMENTS***********************************/

    @GetMapping(value = "/departments")
    public String showDepartmentPage(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart";
    }

    @PostMapping(value = "/departments/subscribe")
    public String subscribeToNewsLetterFromDepartments(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments";
    }

    /********************************DEPARTMENT-SPECIFIC****************************/

    @GetMapping(value = "/departments/Magical-Law-Enforcement")
    public String showDepartmentPage1(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart_magical_law_enforcement";
    }

    @PostMapping(value = "/departments/Magical-Law-Enforcement/subscribe")
    public String subscribeToNewsLetterFromDepartments1(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments/Magical-Law-Enforcement";
    }



    @GetMapping(value = "/departments/Regulation-and-Control-of-Magical-Creatures")
    public String showDepartmentPage2(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart_regulation_and_control";
    }

    @PostMapping(value = "/departments/Regulation-and-Control-of-Magical-Creatures/subscribe")
    public String subscribeToNewsLetterFromDepartments2(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments/Regulation-and-Control-of-Magical-Creatures";
    }



    @GetMapping(value = "/departments/International-Magical-Cooperation")
    public String showDepartmentPage3(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart_of_international_cooperation";
    }

    @PostMapping(value = "/departments/International-Magical-Cooperation/subscribe")
    public String subscribeToNewsLetterFromDepartments3(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments/International-Magical-Cooperation";
    }



    @GetMapping(value = "/departments/Magical-Transportation")
    public String showDepartmentPage4(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart_of_transportation";
    }

    @PostMapping(value = "/departments/Magical-Transportation/subscribe")
    public String subscribeToNewsLetterFromDepartments4(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments/Magical-Transportation";
    }



    @GetMapping(value = "/departments/Magical-Games-and-Sports")
    public String showDepartmentPage5(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart_of_games_and_sports";
    }

    @PostMapping(value = "/departments/Magical-Games-and-Sports/subscribe")
    public String subscribeToNewsLetterFromDepartments5(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments/Magical-Games-and-Sports";
    }



    @GetMapping(value = "/departments/Mysteries")
    public String showDepartmentPage6(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        return "depart_mystries";
    }

    @PostMapping(value = "/departments/Mysteries/subscribe")
    public String subscribeToNewsLetterFromDepartments6(@ModelAttribute("subscriber") NewsletterSubscriber subscriber){
        System.out.println(subscriber);
        contactUsService.addSubscriber(subscriber);
        return "redirect:/departments/Mysteries";
    }



    /********************************ADMISSION**************************************/

    @GetMapping(value = "/admission")
    public String showAdmission(Model model){
        model.addAttribute("subscriber", new NewsletterSubscriber());
        model.addAttribute("student", new Student());
        return "admission";
    }

    @PostMapping(value = "/admission/new-admission")
    public String newAdmissionResolver(@ModelAttribute("student") Student student){
        admissionService.newAdmission(student);
        return "redirect:/admission";
    }



}// END HOGWARTS-CONTROLLER
