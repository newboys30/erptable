package com.bioFish.ERPTables.dao.mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: TableInfoMapper
 * @Description: TODO
 * @author: newbo
 * @date: 2018年11月8日 下午5:37:04
 */
public interface TablesMapper {
	public List<Map<String,Object>> findTableInfo(String tablename) throws Exception;
	public List<Map<String,Object>> findTableDtlInfo(String tablename) throws Exception;
}
