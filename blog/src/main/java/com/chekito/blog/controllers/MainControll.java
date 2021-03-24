package com.chekito.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller  //мы написали обработку главной страницы при переходе на главную страницу у нас будет вызываться эта функция
public class MainControll {

    @GetMapping("/")
    public String home(Model model) //при переходе на главную страницу вызывается эта функция
    {
        model.addAttribute("title", "Главная страница");
        return "home";
    }

    @GetMapping("/about") /* создаем 2 страницу */
    public String about(Model model)
    {
        model.addAttribute("title", "Страница про нас");
        return "about";
    }

}