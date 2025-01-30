package se.caroline.projektspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.caroline.projektspring.component.AdminDocumentComponent;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final AdminDocumentComponent adminDocumentComponent;

    public AdminController(AdminDocumentComponent adminDocumentComponent) {
        this.adminDocumentComponent = adminDocumentComponent;
    }

    @GetMapping
    public String showAdminDoc(Model model)  {
        model.addAttribute("adminDocuments", adminDocumentComponent.getAdminDocuments());

        return "admin";
    }
}
