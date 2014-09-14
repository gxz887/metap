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

import com.tsdata.sys.entity.MenuExt;
import com.tsdata.sys.model.MenuModel;
import com.tsdata.sys.service.IMenuServiceExt;

@Controller
@Scope("request")
public class MenuController {

	@Resource(name = "menuService")
	private IMenuServiceExt menuService;
	
	@RequestMapping(value = "/menu/index")
	public String index(@ModelAttribute MenuModel menuModel, ModelMap model){
		model.addAttribute(menuModel);
		
		return "/sys/menu/index";
	}
	
	@RequestMapping(value = "/menu/query")
	public String query(@ModelAttribute MenuModel menuModel, ModelMap model){
		MenuExt menuQueryCon = menuModel.getMenuQueryCon();
		List<ICondition> conditions = new ArrayList<ICondition>();
		if(menuQueryCon != null){
		}
		menuModel.setItems(menuService.criteriaQuery(conditions));
		model.addAttribute(menuModel);
		return "/sys/menu/index";
	}
	
	@RequestMapping(value = "/menu/goView")
	public String goView(@ModelAttribute MenuModel menuModel, ModelMap model){
		if(menuModel.getDataId() != 0){
			MenuExt menuExt = menuService.load(menuModel.getDataId(), true);
			menuModel.setMenuExt(menuExt);
		}
		
		model.addAttribute(menuModel);
		return "/sys/menu/detail";
	}
	
	@RequestMapping(value = "/menu/goCreate")
	public String goCreate(@ModelAttribute MenuModel menuModel, ModelMap model){
		menuModel.setOperationType("create");
		model.addAttribute(menuModel);
		return "/sys/menu/edit";
	}
	
	@RequestMapping(value = "/menu/doCreate")
	public String doCreate(@ModelAttribute MenuModel menuModel, ModelMap model){
		if(menuModel.getMenuExt() != null){
			menuService.create(menuModel.getMenuExt());
		}
		
		return "forward:/menu/query";
	}
	
	@RequestMapping(value = "/menu/goEdit")
	public String goEdit(@ModelAttribute MenuModel menuModel, ModelMap model){
		menuModel.setOperationType("edit");
		if(menuModel.getDataId() != 0){
			MenuExt menuExt = menuService.load(menuModel.getDataId(), true);
			menuModel.setMenuExt(menuExt);
			model.addAttribute(menuModel);
		}
		return "/sys/menu/edit";
	}
	
	@RequestMapping(value = "/menu/doEdit")
	public String doEdit(@ModelAttribute MenuModel menuModel, ModelMap model){
		if(menuModel.getMenuExt() != null && menuModel.getMenuExt().getId() != 0){
			MenuExt menuExt = menuModel.getMenuExt();
			MenuExt menuExtPer = menuService.load(menuModel.getMenuExt().getId(), true);
			menuService.save(menuExt);
		}
		return "forward:/menu/query";
	}
	
		@RequestMapping(value = "/menu/doDelete")
	public String doDelete(@ModelAttribute MenuModel menuModel, ModelMap model){
		if(menuModel.getMenuExt() != null){
			menuService.create(menuModel.getMenuExt());
		}
		if(menuModel.getDataId() != 0){
			MenuExt menuExt = menuService.load(menuModel.getDataId(), true);
			menuService.delete(menuExt);
		}
		return "forward:/menu/query";
	}
	
}