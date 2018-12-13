package top.d3rc.https.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import top.d3rc.https.entity.User;

@Controller
@RequestMapping
public class PageController {

    @GetMapping("/")
    public String index(ModelMap modelMap) {
        User user = new User("张三", "123");
        modelMap.addAttribute("user", user);
        return "index";
    }
}
