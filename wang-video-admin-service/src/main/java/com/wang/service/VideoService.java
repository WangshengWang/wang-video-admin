package com.wang.service;

import com.wang.pojo.Bgm;
import com.wang.utils.PagedResult;

public interface VideoService {

	public void addBgm(Bgm bgm);
	
	public PagedResult queryBgmList(Integer page, Integer pageSize);
	
	public void deleteBgm(String id);
	
	public PagedResult queryReportList(Integer page, Integer pageSize);
	
	public void updateVideoStatus(String videoId, Integer status);
}
