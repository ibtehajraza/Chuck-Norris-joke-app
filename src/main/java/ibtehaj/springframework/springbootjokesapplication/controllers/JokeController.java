package ibtehaj.springframework.springbootjokesapplication.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import ibtehaj.springframework.springbootjokesapplication.services.JokeService;
import ibtehaj.springframework.springbootjokesapplication.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {


    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }




    @RequestMapping({"/", ""})
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getRandomJoke());
        return "jokes";
    }

}
