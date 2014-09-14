package com.tsdata.sys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sogou.hibernate.*;
import com.tsdata.common.TSUtil;
import com.tsdata.sys.entity.NewsExt;
import com.tsdata.sys.model.NewsModel;
import com.tsdata.sys.service.INewsServiceExt;

@Controller
@Scope("request")
public class NewsController {

	@Resource(name = "newsService")
	private INewsServiceExt newsService;
	
	@RequestMapping(value = "/news/index")
	public String index(@ModelAttribute NewsModel newsModel, ModelMap model){
		model.addAttribute(newsModel);
		
		return "/sys/news/index";
	}
	
	@RequestMapping(value = "/news/query")
	public String query(@ModelAttribute NewsModel newsModel, ModelMap model){
		NewsExt newsQueryCon = newsModel.getNewsQueryCon();
		List<ICondition> conditions = new ArrayList<ICondition>();
		if(newsQueryCon != null){
		}
		newsModel.setItems(newsService.criteriaQuery(conditions));
		model.addAttribute(newsModel);
		return "/sys/news/index";
	}
	
	@RequestMapping(value = "/news/goView")
	public String goView(@ModelAttribute NewsModel newsModel, ModelMap model){
		if(newsModel.getDataId() != 0){
			NewsExt newsExt = newsService.load(newsModel.getDataId(), true);
			newsModel.setNewsExt(newsExt);
		}
		
		model.addAttribute(newsModel);
		return "/sys/news/detail";
	}
	
	@RequestMapping(value = "/news/goCreate")
	public String goCreate(@ModelAttribute NewsModel newsModel, ModelMap model){
		newsModel.setOperationType("create");
		model.addAttribute(newsModel);
		return "/sys/news/edit";
	}
	
	@RequestMapping(value = "/news/doCreate")
	public String doCreate(@ModelAttribute NewsModel newsModel, ModelMap model,HttpServletRequest request){
		if(newsModel.getNewsExt() != null){
			newsModel.getNewsExt().setbigimg(TSUtil.saveFile(newsModel.getNewsExt().getBigImgFile(), request));
			newsModel.getNewsExt().setsmallimg(TSUtil.saveFile(newsModel.getNewsExt().getSmallImgFile(), request));
			newsService.create(newsModel.getNewsExt());
		}
		
		return "forward:/news/query";
	}
	
	@RequestMapping(value = "/news/goEdit")
	public String goEdit(@ModelAttribute NewsModel newsModel, ModelMap model){
		newsModel.setOperationType("edit");
		if(newsModel.getDataId() != 0){
			NewsExt newsExt = newsService.load(newsModel.getDataId(), true);
			newsModel.setNewsExt(newsExt);
			model.addAttribute(newsModel);
		}
		return "/sys/news/edit";
	}
	
	@RequestMapping(value = "/news/doEdit")
	public String doEdit(@ModelAttribute NewsModel newsModel, ModelMap model){
		if(newsModel.getNewsExt() != null && newsModel.getNewsExt().getId() != 0){
			NewsExt newsExt = newsModel.getNewsExt();
			NewsExt newsExtPer = newsService.load(newsModel.getNewsExt().getId(), true);
			//bug bug bug TODO
			//如果用户上传文件，以用户上传文件为主，如果用户没有上传文件，以存储的为主
			if(newsModel.getNewsExt().getBigImgFile()!=null ){
				if(newsExtPer!=null && newsExtPer.getbigimg()!=null &&  !newsExtPer.getbigimg().isEmpty()){
					newsExt.setbigimg(newsExtPer.getbigimg());
				}
			}
			if(newsModel.getNewsExt().getSmallImgFile()!=null){
				if(newsExtPer!=null  && newsExtPer.getsmallimg()!=null && !newsExtPer.getsmallimg().isEmpty()){
					newsExt.setsmallimg(newsExtPer.getsmallimg());
				}
			}
			
			newsService.save(newsExt);
		}
		return "forward:/news/query";
	}
	
		@RequestMapping(value = "/news/doDelete")
	public String doDelete(@ModelAttribute NewsModel newsModel, ModelMap model){
		if(newsModel.getNewsExt() != null){
			newsService.create(newsModel.getNewsExt());
		}
		if(newsModel.getDataId() != 0){
			NewsExt newsExt = newsService.load(newsModel.getDataId(), true);
			newsService.delete(newsExt);
		}
		return "forward:/news/query";
	}
	
}