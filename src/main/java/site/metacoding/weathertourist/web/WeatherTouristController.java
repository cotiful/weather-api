package site.metacoding.weathertourist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherTouristController {

    @GetMapping("/weather")
    public String weather() {
        return "weather";
    }
}
