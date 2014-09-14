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

import com.tsdata.sys.entity.CategoryExt;
import com.tsdata.sys.model.CategoryModel;
import com.tsdata.sys.service.ICategoryServiceExt;

@Controller
@Scope("request")
public class CategoryController {

	@Resource(name = "categoryService")
	private ICategoryServiceExt categoryService;
	
	@RequestMapping(value = "/category/index")
	public String index(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		model.addAttribute(categoryModel);
		
		return "/sys/category/index";
	}
	
	@RequestMapping(value = "/category/query")
	public String query(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		CategoryExt categoryQueryCon = categoryModel.getCategoryQueryCon();
		List<ICondition> conditions = new ArrayList<ICondition>();
		if(categoryQueryCon != null){
		}
		categoryModel.setItems(categoryService.criteriaQuery(conditions));
		model.addAttribute(categoryModel);
		return "/sys/category/index";
	}
	
	@RequestMapping(value = "/category/goView")
	public String goView(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		if(categoryModel.getDataId() != 0){
			CategoryExt categoryExt = categoryService.load(categoryModel.getDataId(), true);
			categoryModel.setCategoryExt(categoryExt);
		}
		
		model.addAttribute(categoryModel);
		return "/sys/category/detail";
	}
	
	@RequestMapping(value = "/category/goCreate")
	public String goCreate(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		categoryModel.setOperationType("create");
		model.addAttribute(categoryModel);
		return "/sys/category/edit";
	}
	
	@RequestMapping(value = "/category/doCreate")
	public String doCreate(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		if(categoryModel.getCategoryExt() != null){
			categoryService.create(categoryModel.getCategoryExt());
		}
		
		return "forward:/category/query";
	}
	
	@RequestMapping(value = "/category/goEdit")
	public String goEdit(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		categoryModel.setOperationType("edit");
		if(categoryModel.getDataId() != 0){
			CategoryExt categoryExt = categoryService.load(categoryModel.getDataId(), true);
			categoryModel.setCategoryExt(categoryExt);
			model.addAttribute(categoryModel);
		}
		return "/sys/category/edit";
	}
	
	@RequestMapping(value = "/category/doEdit")
	public String doEdit(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		if(categoryModel.getCategoryExt() != null && categoryModel.getCategoryExt().getId() != 0){
			CategoryExt categoryExt = categoryModel.getCategoryExt();
			CategoryExt categoryExtPer = categoryService.load(categoryModel.getCategoryExt().getId(), true);
			categoryService.save(categoryExt);
		}
		return "forward:/category/query";
	}
	
		@RequestMapping(value = "/category/doDelete")
	public String doDelete(@ModelAttribute CategoryModel categoryModel, ModelMap model){
		if(categoryModel.getCategoryExt() != null){
			categoryService.create(categoryModel.getCategoryExt());
		}
		if(categoryModel.getDataId() != 0){
			CategoryExt categoryExt = categoryService.load(categoryModel.getDataId(), true);
			categoryService.delete(categoryExt);
		}
		return "forward:/category/query";
	}
	
}