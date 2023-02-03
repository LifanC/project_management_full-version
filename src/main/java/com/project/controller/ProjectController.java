package com.project.controller;

import java.sql.SQLException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import com.project.entity.*;

@RestController
public class ProjectController {

	@Autowired
	private PorjectRepository porjectRepository;

	@GetMapping("index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("index");
		return view;
	}

	@GetMapping("projects")
	public Iterable<Project> projects() {
		Iterable<Project> list = porjectRepository.findAll();
		return list; 
	}

	@PostMapping("save")
	public void save(Project project) {
		List<Project> data = porjectRepository.queryByNumber(project.getNumber());
		if(data.size() == 0) {
			porjectRepository.save(project);
		}else if(data.size() >= 1) {
			data.forEach(e->{
					try {
						project.setId(e.getId());
						DAO.updateData(project);
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
			});
		}
	}

	Iterable<Project> data;
	@PostMapping("projectonly")
	public void projectonlypost(Project project) {
		data = porjectRepository.queryByNumber(project.getNumber());
	}

	@GetMapping("projectonly")
	public Iterable<Project> projectonly() {
		return data;
	}

	@PostMapping("delete")
	public void delete(Project project) {
		List<Project> data = porjectRepository.queryByNumber(project.getNumber());
		data.forEach(e -> {
			porjectRepository.deleteById(e.getId());
		});
	}
	
	@PostMapping("business")
	public void business(ProjectCount projectCount) throws SQLException {
		List<Project> data = porjectRepository.queryByNumber(projectCount.getTempnumber());
		String tempStr = "";
		Integer eforbuy = null;
		Integer eforsell = null;
		if(projectCount.getTrueorfalse()!="補貨或賣出") {
			for(Project e:data) {
				if(projectCount.getTrueorfalse().equals("產品補貨")) {
					tempStr="buy";
					eforbuy=e.getCount();
				}else if(projectCount.getTrueorfalse().equals("產品賣出")) {
					tempStr="sell";
					eforsell=e.getCount();
				}
			}
		}
		Integer pCount = null;
		Integer eCount = null;
		Integer result = null;
			switch(tempStr) {
			case "buy":
				pCount = projectCount.getCount();
				eCount = eforbuy;
				result = eCount+pCount;
				projectCount.setCount(result);
				DAO.updateCount(projectCount);
				DAO.updateDaybuy(projectCount);
				break;
			case "sell":
				pCount = projectCount.getCount();
				eCount = eforsell;
				result = eCount-pCount;
				projectCount.setCount(result);
				DAO.updateCount(projectCount);
				DAO.updateDaysell(projectCount);
				break;
			}
			
			

			
	}

}























