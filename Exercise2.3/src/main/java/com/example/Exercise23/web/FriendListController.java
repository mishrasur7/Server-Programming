package com.example.Exercise23.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Exercise23.model.Friend;

@Controller
public class FriendListController {

	@RequestMapping("/index")
	public String friendList(Friend friend, Model model) {
		Friend friend1 = new Friend("Suraj Mishra");
		Friend friend2 = new Friend("Shova Pandey");

		ArrayList<Friend> friends = new ArrayList<Friend>();

		friends.add(friend1);
		friends.add(friend2);
		friends.add(new Friend(friend.getName())); 

		model.addAttribute("friends", friends);
		return "friendlist";
	}
}
