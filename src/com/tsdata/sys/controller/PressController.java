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

import com.tsdata.sys.entity.PressExt;
import com.tsdata.sys.model.PressModel;
import com.tsdata.sys.service.IPressServiceExt;

@Controller
@Scope("request")
public class PressController {

	@Resource(name = "pressService")
	private IPressServiceExt pressService;
	
	@RequestMapping(value = "/press/index")
	public String index(@ModelAttribute PressModel pressModel, ModelMap model){
		model.addAttribute(pressModel);
		
		return "/sys/press/index";
	}
	
	@RequestMapping(value = "/press/query")
	public String query(@ModelAttribute PressModel pressModel, ModelMap model){
		PressExt pressQueryCon = pressModel.getPressQueryCon();
		List<ICondition> conditions = new ArrayList<ICondition>();
		if(pressQueryCon != null){
		}
		pressModel.setItems(pressService.criteriaQuery(conditions));
		model.addAttribute(pressModel);
		return "/sys/press/index";
	}
	
	@RequestMapping(value = "/press/goView")
	public String goView(@ModelAttribute PressModel pressModel, ModelMap model){
		if(pressModel.getDataId() != 0){
			PressExt pressExt = pressService.load(pressModel.getDataId(), true);
			pressModel.setPressExt(pressExt);
		}
		
		model.addAttribute(pressModel);
		return "/sys/press/detail";
	}
	
	@RequestMapping(value = "/press/goCreate")
	public String goCreate(@ModelAttribute PressModel pressModel, ModelMap model){
		pressModel.setOperationType("create");
		model.addAttribute(pressModel);
		return "/sys/press/edit";
	}
	
	@RequestMapping(value = "/press/doCreate")
	public String doCreate(@ModelAttribute PressModel pressModel, ModelMap model){
		if(pressModel.getPressExt() != null){
			pressService.create(pressModel.getPressExt());
		}
		
		return "forward:/press/query";
	}
	
	@RequestMapping(value = "/press/goEdit")
	public String goEdit(@ModelAttribute PressModel pressModel, ModelMap model){
		pressModel.setOperationType("edit");
		if(pressModel.getDataId() != 0){
			PressExt pressExt = pressService.load(pressModel.getDataId(), true);
			pressModel.setPressExt(pressExt);
			model.addAttribute(pressModel);
		}
		return "/sys/press/edit";
	}
	
	@RequestMapping(value = "/press/doEdit")
	public String doEdit(@ModelAttribute PressModel pressModel, ModelMap model){
		if(pressModel.getPressExt() != null && pressModel.getPressExt().getId() != 0){
			PressExt pressExt = pressModel.getPressExt();
			PressExt pressExtPer = pressService.load(pressModel.getPressExt().getId(), true);
			pressService.save(pressExt);
		}
		return "forward:/press/query";
	}
	
		@RequestMapping(value = "/press/doDelete")
	public String doDelete(@ModelAttribute PressModel pressModel, ModelMap model){
		if(pressModel.getPressExt() != null){
			pressService.create(pressModel.getPressExt());
		}
		if(pressModel.getDataId() != 0){
			PressExt pressExt = pressService.load(pressModel.getDataId(), true);
			pressService.delete(pressExt);
		}
		return "forward:/press/query";
	}
	
}