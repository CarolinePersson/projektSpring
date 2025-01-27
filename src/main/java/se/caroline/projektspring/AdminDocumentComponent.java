package se.caroline.projektspring;

import org.springframework.stereotype.Component;
import se.caroline.projektspring.model.AdminDocument;

import java.util.List;

@Component
public class AdminDocumentComponent {

    public List<AdminDocument> getAdminDocuments() {
        return List.of(
                new AdminDocument("Admin Doc 1", "School"),
                new AdminDocument("Admin Doc 2", "Work"),
                new AdminDocument("Admin Doc 3", "Home")
        );
    }
}


