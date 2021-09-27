package com.boardGame.organizer.controller;


import com.boardGame.organizer.model.Game;
import com.boardGame.organizer.model.Protector;
import com.boardGame.organizer.model.User;
import com.boardGame.organizer.service.GameService;
import com.boardGame.organizer.service.ProtectorService;
import com.boardGame.organizer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	ProtectorService protectorService;

	@Autowired
	UserService userService;

	@Autowired
	GameService gameService;

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String startPage(){
		return "index";
	}


	@RequestMapping(value = {"/protectorsList" }, method = RequestMethod.GET)
	public String protectorsList(ModelMap model) {
		List<Protector> protectors = protectorService.findAll();
		model.addAttribute("protectors", protectors);
		return "protectorsList";
	}

	@RequestMapping(value = {"/userslist" }, method = RequestMethod.GET)
	public String listUsers(ModelMap model) {
		List<User> users = userService.findAllUsers();
		model.addAttribute("users", users);
		return "userslist";
	}

	@RequestMapping(value = {"/gameList" }, method = RequestMethod.GET)
	public String GameList(ModelMap model) {
		List<Game> games = gameService.findAll();
		model.addAttribute("games", games);
		return "gamesList";
	}

	@RequestMapping(value = "/newuser", method = RequestMethod.POST)
	public String saveUser(@Valid User user, BindingResult result, ModelMap model){
		if (result.hasErrors()) {
			return "registration";
		}
		userService.saveUser(user);
		return "registrationsuccess";
	}

	@RequestMapping(value = { "/newuser" }, method = RequestMethod.GET)
	public String newUser(ModelMap model) {
		User user = new User();
		model.addAttribute("user", user);
		model.addAttribute("edit", false);
		return "registration";
	}


}