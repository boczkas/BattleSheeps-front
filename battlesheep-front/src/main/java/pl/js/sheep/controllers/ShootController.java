package pl.js.sheep.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.js.sheep.dto.Shoot;
import pl.js.sheep.models.ShootList;

@Controller
public class ShootController {

  @Autowired
  private ShootList list;

  @RequestMapping(value = "/shoot", method = RequestMethod.GET, produces = "text/html")
  public String greetingForm(Model model) {
    model.addAttribute("shoot", new Shoot());
    model.addAttribute("list", list);
    return "shoot";
  }

  @RequestMapping(value = "/shoot", method = RequestMethod.POST, produces = "text/html")
  public String greetingSubmit(@ModelAttribute Shoot shoot) {
    list.addShoot(shoot);
    return "redirect:/shoot";
  }

  @RequestMapping(value = "/getlist", method = RequestMethod.GET)
  public @ResponseBody String getListContent() {
      return list.toString();
  }

}