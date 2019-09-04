package com.renyuanhang.service;

import java.util.List;
import java.util.Map;

import com.renyuanhang.entity.Movie;

/**
 * flandre
 *
 * 2019年9月3日
 */
public interface MovieService {

	List<Movie> list(Map<String, Object> map);

	boolean add(Movie movie, Integer[] lids);



}
