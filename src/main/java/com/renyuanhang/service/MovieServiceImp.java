package com.renyuanhang.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.renyuanhang.entity.Movie;
import com.renyuanhang.mapper.MovieDao;

/**
 * flandre
 *
 * 2019年9月3日
 */
@Service
public class MovieServiceImp implements MovieService{

	@Resource
	private MovieDao dao;

	public List<Movie> list(Map<String, Object> map) {
		return dao.list(map);
	}

	public boolean add(Movie movie, Integer[] lids) {
		Integer num = dao.add(movie);
		if(num>0){
			Integer mid = movie.getMid();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("mid", mid);
			for (Integer i : lids) {
				map.put("lid", i);
				dao.addm(map);				
			}
			return true;
		}

		return false;
	}

/*	public boolean dels(String[] mids) {
		Integer num = dao.dels(mids);
		if(num>0){
			dao.dell(mids);
			return true;
		}
		return false;
	}*/
}
