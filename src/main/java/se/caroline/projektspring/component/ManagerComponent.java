package se.caroline.projektspring.component;

import org.springframework.stereotype.Component;
import se.caroline.projektspring.ManagerInfo;

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


