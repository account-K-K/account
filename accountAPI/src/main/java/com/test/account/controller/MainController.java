package com.test.account.controller;

import java.util.List;

import com.test.account.service.AccountService;
import com.test.account.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class MainController {
  @Autowired
  public AccountService accountService;

  @CrossOrigin
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String home() {
    return "Hello World!";
  }

  @CrossOrigin
  @RequestMapping(value = "/all", method = RequestMethod.GET)
  public List<User> getUserAll() {
    return accountService.getUserListAll();
  }

  @CrossOrigin
  @RequestMapping(value = "/name", method = RequestMethod.GET)
  public List<User> getUserByName(@RequestParam("name") String name) {
    return accountService.getUsetListByName(name);
  }

  @CrossOrigin
  @RequestMapping(value = "/userId", method = RequestMethod.GET)
  public List<Integer> getUserIdList() {
    return accountService.getUserIdList();
  }

  @CrossOrigin
  @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
  public int updateUser(@RequestParam("name") String name) {
    return accountService.updateUser(name);
  }
}