package com.zkmanager.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkmanager.po.Hole;

public interface HoleService {
	public Hole findHoleById(int id);
	
	public List<Hole> findHoleByParentId(int parentId);
	
	public List<Hole> findHoleByParentId2(int parentId2);
}
