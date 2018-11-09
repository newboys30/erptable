package com.bioFish.ERPTables.Service;

import java.util.List;
import java.util.Map;

/**
 * table信息接口
 * @ClassName: TablesServiceI
 * @Description: TODO
 * @author: newbo
 * @date: 2018年11月8日 下午3:45:49
 */
public interface TablesServiceI {
	
	public List<Map<String,Object>> getTableInfo(String tablename) throws Exception;
	
	public List<Map<String,Object>> getTableDtlInfo(String tablename) throws Exception;
}
