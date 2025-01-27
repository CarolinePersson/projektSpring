package se.caroline.projektspring;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import se.caroline.projektspring.model.ManagerDocument;

import java.util.List;

@Component
public class ManagerComponent {
    public List<ManagerInfo> getManagerInfo() {
        return List.of(
                new ManagerInfo("John Doe", "Operations Manager"),
                new ManagerInfo("Jane Smith", "Sales Manager")
        );
    }
}

//    public static class MvcConfig implements WebMvcConfigurer {
//        @Override
//
//        public void addViewControllers(ViewControllerRegistry registry) {
//            registry.addViewController("/").setViewName("index");
////            registry.addViewController("/login").setViewName("login");
////            registry.addViewController("/admin").setViewName("admin");
//
//
//        }
//
//    }
//}


