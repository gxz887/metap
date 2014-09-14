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

import com.tsdata.sys.entity.ProjectImgExt;
import com.tsdata.sys.model.ProjectImgModel;
import com.tsdata.sys.service.IProjectImgServiceExt;

@Controller
@Scope("request")
public class ProjectImgController {

	@Resource(name = "projectImgService")
	private IProjectImgServiceExt projectImgService;
	
	@RequestMapping(value = "/projectimg/index")
	public String index(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		model.addAttribute(projectImgModel);
		
		return "/sys/projectimg/index";
	}
	
	@RequestMapping(value = "/projectimg/query")
	public String query(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		ProjectImgExt projectImgQueryCon = projectImgModel.getProjectImgQueryCon();
		List<ICondition> conditions = new ArrayList<ICondition>();
		if(projectImgQueryCon != null){
		}
		projectImgModel.setItems(projectImgService.criteriaQuery(conditions));
		model.addAttribute(projectImgModel);
		return "/sys/projectimg/index";
	}
	
	@RequestMapping(value = "/projectimg/goView")
	public String goView(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		if(projectImgModel.getDataId() != 0){
			ProjectImgExt projectImgExt = projectImgService.load(projectImgModel.getDataId(), true);
			projectImgModel.setProjectImgExt(projectImgExt);
		}
		
		model.addAttribute(projectImgModel);
		return "/sys/projectimg/detail";
	}
	
	@RequestMapping(value = "/projectimg/goCreate")
	public String goCreate(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		projectImgModel.setOperationType("create");
		model.addAttribute(projectImgModel);
		return "/sys/projectimg/edit";
	}
	
	@RequestMapping(value = "/projectimg/doCreate")
	public String doCreate(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		if(projectImgModel.getProjectImgExt() != null){
			projectImgService.create(projectImgModel.getProjectImgExt());
		}
		
		return "forward:/projectimg/query";
	}
	
	@RequestMapping(value = "/projectimg/goEdit")
	public String goEdit(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		projectImgModel.setOperationType("edit");
		if(projectImgModel.getDataId() != 0){
			ProjectImgExt projectImgExt = projectImgService.load(projectImgModel.getDataId(), true);
			projectImgModel.setProjectImgExt(projectImgExt);
			model.addAttribute(projectImgModel);
		}
		return "/sys/projectimg/edit";
	}
	
	@RequestMapping(value = "/projectimg/doEdit")
	public String doEdit(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		if(projectImgModel.getProjectImgExt() != null && projectImgModel.getProjectImgExt().getId() != 0){
			ProjectImgExt projectImgExt = projectImgModel.getProjectImgExt();
			ProjectImgExt projectImgExtPer = projectImgService.load(projectImgModel.getProjectImgExt().getId(), true);
			projectImgService.save(projectImgExt);
		}
		return "forward:/projectimg/query";
	}
	
		@RequestMapping(value = "/projectimg/doDelete")
	public String doDelete(@ModelAttribute ProjectImgModel projectImgModel, ModelMap model){
		if(projectImgModel.getProjectImgExt() != null){
			projectImgService.create(projectImgModel.getProjectImgExt());
		}
		if(projectImgModel.getDataId() != 0){
			ProjectImgExt projectImgExt = projectImgService.load(projectImgModel.getDataId(), true);
			projectImgService.delete(projectImgExt);
		}
		return "forward:/projectimg/query";
	}
	
}