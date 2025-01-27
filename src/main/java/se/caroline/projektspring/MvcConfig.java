package se.caroline.projektspring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user").setViewName("user");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/manager").setViewName("manager");
        registry.addViewController("/admin").setViewName("admin");
        // registry.addViewController("/register").setViewName("register");

    }

}