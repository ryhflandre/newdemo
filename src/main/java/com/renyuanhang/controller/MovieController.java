package com.renyuanhang.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.renyuanhang.entity.Movie;
import com.renyuanhang.service.MovieService;

/**
 * flandre
 *
 * 2019年9月3日
 */
@Controller
public class MovieController {

	@Resource
	private MovieService service;
	
	@RequestMapping("list.do")
	public String list(Model model,String mname,@RequestParam(required=false,defaultValue="1")Integer pageNum){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mname", mname);
		
		PageHelper help = new PageHelper();
		help.startPage(pageNum, 3);
		List<Movie> list = service.list(map);
		PageInfo<Movie> page = new PageInfo<>(list);
		
		model.addAttribute("page", page);
		return "list";
	}
	
	@RequestMapping("add.do")
	@ResponseBody
	public boolean add(Movie movie,Integer[] lids){
		boolean flag = service.add(movie,lids);
		return flag;
	}
	
	
}
