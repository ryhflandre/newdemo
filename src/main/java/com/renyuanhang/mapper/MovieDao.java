package com.renyuanhang.mapper;

import java.util.List;
import java.util.Map;

import com.renyuanhang.entity.Movie;

/**
 * flandre
 *
 * 2019年9月3日
 */
public interface MovieDao {

	List<Movie> list(Map<String, Object> map);

	Integer add(Movie movie);

	void addm(Map<String, Object> map);

/*	Integer dels(String[] mids);

	void dell(String[] mids);*/

}
