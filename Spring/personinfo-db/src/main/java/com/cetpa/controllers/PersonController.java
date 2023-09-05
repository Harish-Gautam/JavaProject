package com.cetpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cetpa.models.Person;
import com.cetpa.services.PersonService;

@Controller
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String getHomeView()
	{
		return "home.jsp";
	}
	@RequestMapping("insert")
	public String getInsertView()
	{
		return "insert-person.jsp";
	}
	@RequestMapping("save-record")
	public String savePersonRecord(Person person)
	{
		service.saveRecord(person);
		return "save.jsp";
	}
	@RequestMapping("list")
	public String getPersonList(Model model)
	{
		List<Person> list=service.getList();
		model.addAttribute("plist",list);
		return "person-list.jsp";
	}
	@RequestMapping("search")
	public String getSearchView()
	{
		return "search-person.jsp";
	}
	@RequestMapping("search-record")
	public String searchPersonRecord(int pid,Model model)
	{
		Person p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("pid",pid);
			model.addAttribute("msg","Person record not found");
			return "search-person.jsp";
		}
		model.addAttribute("person",p);
		return "show-person.jsp";
	}
	@RequestMapping("delete")
	public String getDeleteView()
	{
		return "delete-person.jsp";
	}
	@RequestMapping("delete-record")
	public String deletePersonRecord(int pid,Model model)
	{
		Person p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("pid",pid);
			model.addAttribute("msg","Person record does not exist");
			return "delete-person.jsp";
		}
		service.deleteRecord(p);
		return "delete.jsp";
	}
	@RequestMapping("edit")
	public String getEditView()
	{
		return "edit-person.jsp";
	}
	@RequestMapping("show-record")
	public String showPersonRecord(int pid,Model model)
	{
		Person p=service.getRecord(pid);
		if(p==null)
		{
			model.addAttribute("pid",pid);
			model.addAttribute("msg","Person record does not exist");
			return "edit-person.jsp";
		}
		model.addAttribute("person",p);
		return "update-person.jsp";
	}
	@RequestMapping("update-record")
	public String updatePersonRecord(Person person)
	{
		service.updateRecord(person);
		return "update.jsp";
	}
}
