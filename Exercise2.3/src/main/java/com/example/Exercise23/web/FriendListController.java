package com.example.Exercise23.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Exercise23.model.Friend;

@Controller
public class FriendListController {
	ArrayList<Friend> friends = new ArrayList<>();
	Friend friend1 = new Friend("Suraj Mishra");
	Friend friend2 = new Friend("Alpo remes");

	@GetMapping("/index")
	public String friendList(Friend friend, Model model) {
		friends.clear();
		friends.add(friend1);
		friends.add(friend2);
		model.addAttribute("friends", friends);

		return "friendlist";
	}

	@PostMapping("/index")
	public String addFriends(Friend friend, Model model) {

		friends.add(friend);

		model.addAttribute("friends", friends);

		return "friendlist";
	}

}
