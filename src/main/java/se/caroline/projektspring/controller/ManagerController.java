package se.caroline.projektspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.caroline.projektspring.AdminDocumentComponent;
import se.caroline.projektspring.ManagerComponent;
import se.caroline.projektspring.ManagerInfo;

import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    private final ManagerComponent managerComponent;
    private final AdminDocumentComponent adminDocumentComponent;

    public ManagerController(ManagerComponent managerComponent, AdminDocumentComponent adminDocumentComponent) {
        this.managerComponent = managerComponent;
        this.adminDocumentComponent = adminDocumentComponent;
    }

    @GetMapping
    public String showManagerInfo(Model model) {
        // Lägg till manager information
        List<ManagerInfo> managerInfoList = managerComponent.getManagerInfo();
        model.addAttribute("managerInfo", managerInfoList);

        // Lägg till admin documents
        model.addAttribute("adminDocuments", adminDocumentComponent.getAdminDocuments());

        return "manager"; // manager.html
    }
}
