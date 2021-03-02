package com.zkmanager.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zkmanager.po.Hole;

public interface HoleDao {
	public Hole findHoleById(@Param("id") int id);
	
	public List<Hole> findHoleByParentId(@Param("parentId") int parentId);
	
	public List<Hole> findHoleByParentId2(@Param("parentId2") int parentId2);

}
