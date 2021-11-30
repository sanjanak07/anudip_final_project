package com.spring.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.store.Repository.CheckRepository;
import com.spring.store.Repository.ContactRepository;
import com.spring.store.Repository.UserRepository;
import com.spring.store.entity.CheckoutData;
import com.spring.store.entity.ContactData;
import com.spring.store.entity.UserData;



@Controller
public class HomeController {
	
	@Autowired
	private UserRepository repo;
	@Autowired
	private CheckRepository check;
	@Autowired
	private ContactRepository con;
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/k_infant") //kids infant
	public String kinfant()
	{
		return "kinfant";
	}
	
	@GetMapping("/k_ethnic") //kids ethnic
	public String kethnic()
	{
		return "kethnic";
	}
	
	@GetMapping("/k_casual") //kids casual
	public String kcasual()
	{
		return "kcasual";
	}
	
	@GetMapping("/k_party") //kids party
	public String kparty()
	{
		return "kparty";
	}
	
	@GetMapping("/l_ethnic") //ladies ethnic
	public String lethnic()
	{
		return "lethnic";
	}
	
	
	@GetMapping("/l_casual") //ladies casual
	public String lcasual()
	{
		return "lcasual";
	}
	
	
	@GetMapping("/l_party") //ladies party
	public String lparty()
	{
		return "lparty";
	}
	
	@GetMapping("/m_ethnic") //mens ethnic
	public String methnic()
	{
		return "methnic";
	}
	
	@GetMapping("/m_casual") //mens casual
	public String mcasual()
	{
		return "mcasual";
	}
	
	@GetMapping("/m_formal") //mens formal
	public String mformal()
	{
		return "mformal";
	}
	
	@GetMapping("/m_party") //mens party
	public String mparty()
	{
		return "mparty";
	}
	
	@GetMapping("/foundation") //foundation
	public String foundation()
	{
		return "foundation";
	}
	
	@GetMapping("/eyeliner") //eyeliner
	public String eyeliner()
	{
		return "eyeliner";
	}
	
	@GetMapping("/lipstick") //lipstick
	public String lipstick()
	{
		return "lipstick";
	}
	
	@GetMapping("/nailpaint") //nail paint
	public String nailpaint()
	{
		return "nailpaint";
	}
	
	@GetMapping("/l_perfume") //ladies perfume
	public String lperfume()
	{
		return "lperfume";
	}
	
	@GetMapping("/m_perfume") //mens perfume
	public String mperfume()
	{
		return "mperfume";
	}
	
	@GetMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute UserData u, HttpSession session)
	{
		System.out.println(u);
		
		repo.save(u);
		session.setAttribute("message", "User Register Successfully");
		
		
		return "redirect:/login";
	}
	
	
	@PostMapping("/contact")
	public String contact(@ModelAttribute ContactData u, HttpSession session)
	{
		System.out.println(u);
		
		con.save(u);
		
		
		
		return "redirect:/home";
	}
	@GetMapping("/checkout")
	public String checkout()
	{
		return "checkout";
	}
	@PostMapping("/checkoutpg")
	public String checkoutpg(@ModelAttribute CheckoutData c, HttpSession session)
	{
		System.out.println(c);
		
		check.save(c);
		
		
		
		return "redirect:/checkoutnote";
		
	}
	@GetMapping("/checkoutnote")
	public String checkoutnote()
	{
		return "checkoutpg";
	}
}

