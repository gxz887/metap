package com.tsdata.sys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sogou.hibernate.*;

import com.tsdata.sys.entity.ProjectExt;
import com.tsdata.sys.model.ProjectModel;
import com.tsdata.sys.service.IProjectServiceExt;

@Controller
@Scope("request")
public class ProjectController {

	@Resource(name = "projectService")
	private IProjectServiceExt projectService;
	
	@RequestMapping(value = "/project/index")
	public String index(@ModelAttribute ProjectModel projectModel, ModelMap model){
		model.addAttribute(projectModel);
		
		return "/sys/project/index";
	}
	
	@RequestMapping(value = "/project/query")
	public String query(@ModelAttribute ProjectModel projectModel, ModelMap model){
		ProjectExt projectQueryCon = projectModel.getProjectQueryCon();
		List<ICondition> conditions = new ArrayList<ICondition>();
		if(projectQueryCon != null){
		}
		projectModel.setItems(projectService.criteriaQuery(conditions));
		model.addAttribute(projectModel);
		return "/sys/project/index";
	}
	
	@RequestMapping(value = "/project/goView")
	public String goView(@ModelAttribute ProjectModel projectModel, ModelMap model){
		if(projectModel.getDataId() != 0){
			ProjectExt projectExt = projectService.load(projectModel.getDataId(), true);
			projectModel.setProjectExt(projectExt);
		}
		
		model.addAttribute(projectModel);
		return "/sys/project/detail";
	}
	
	@RequestMapping(value = "/project/goCreate")
	public String goCreate(@ModelAttribute ProjectModel projectModel, ModelMap model){
		projectModel.setOperationType("create");
		model.addAttribute(projectModel);
		return "/sys/project/edit";
	}
	
	@RequestMapping(value = "/project/doCreate")
	public String doCreate(@ModelAttribute ProjectModel projectModel, ModelMap model){
		if(projectModel.getProjectExt() != null){
			projectService.create(projectModel.getProjectExt());
		}
		
		return "forward:/project/query";
	}
	
	@RequestMapping(value = "/project/goEdit")
	public String goEdit(@ModelAttribute ProjectModel projectModel, ModelMap model){
		projectModel.setOperationType("edit");
		if(projectModel.getDataId() != 0){
			ProjectExt projectExt = projectService.load(projectModel.getDataId(), true);
			projectModel.setProjectExt(projectExt);
			model.addAttribute(projectModel);
		}
		return "/sys/project/edit";
	}
	
	@RequestMapping(value = "/project/doEdit")
	public String doEdit(@ModelAttribute ProjectModel projectModel, ModelMap model){
		if(projectModel.getProjectExt() != null && projectModel.getProjectExt().getId() != 0){
			ProjectExt projectExt = projectModel.getProjectExt();
			ProjectExt projectExtPer = projectService.load(projectModel.getProjectExt().getId(), true);
			projectService.save(projectExt);
		}
		return "forward:/project/query";
	}
	
		@RequestMapping(value = "/project/doDelete")
	public String doDelete(@ModelAttribute ProjectModel projectModel, ModelMap model){
		if(projectModel.getProjectExt() != null){
			projectService.create(projectModel.getProjectExt());
		}
		if(projectModel.getDataId() != 0){
			ProjectExt projectExt = projectService.load(projectModel.getDataId(), true);
			projectService.delete(projectExt);
		}
		return "forward:/project/query";
	}
	
}