package com.baeldung.web.controller;

import com.baeldung.service.IUserService;
import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagementController {

  @Autowired
  IUserService userService;

  @GetMapping("/management")
  public String getManagement(final Locale locale, final Model model) {
    model.addAttribute("users", userService.getUsersFromSessionRegistry());
    return "users";
  }
}
