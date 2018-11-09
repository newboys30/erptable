package com.bioFish.ERPTables.Service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bioFish.ERPTables.DataSource.ReadDataSource;
import com.bioFish.ERPTables.Service.TablesServiceI;
import com.bioFish.ERPTables.dao.mapper.TablesMapper;
import com.github.pagehelper.PageHelper;

/**
 * table结构实现类
 * @ClassName: TablesServiceImpl
 * @Description: TODO
 * @author: newbo
 * @date: 2018年11月8日 下午3:53:00
 */
@Service("tablesService")
public class TablesServiceImpl implements TablesServiceI{
	
	@Autowired
	private TablesMapper tablesMapper;
	
	@ReadDataSource
	public List<Map<String,Object>> getTableInfo(String tablename) throws Exception{
		return tablesMapper.findTableInfo(tablename); 
	}
	
	@ReadDataSource
	public List<Map<String,Object>> getTableDtlInfo(String tablename) throws Exception{
		return tablesMapper.findTableDtlInfo(tablename);
	}
}
