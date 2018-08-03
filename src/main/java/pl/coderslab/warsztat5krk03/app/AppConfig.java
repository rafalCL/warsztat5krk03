package pl.coderslab.warsztat5krk03.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"pl.coderslab.warsztat5krk03"})
public class AppConfig {
}
