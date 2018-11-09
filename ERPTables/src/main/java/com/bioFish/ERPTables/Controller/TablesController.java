package com.bioFish.ERPTables.Controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bioFish.ERPTables.Service.TablesServiceI;
import com.bioFish.ERPTables.util.JsonObject;
import com.bioFish.ERPTables.util.JsonUtil;
import com.bioFish.ERPTables.util.WebParam;

/**
 * 数据表信息
 * @ClassName: TablesController
 * @Description: TODO
 * @author: newbo
 * @date: 2018年11月8日 下午3:43:24
 */
@RestController
public class TablesController {
	
	@Resource(name = "tablesService")
	private TablesServiceI tablesService;
	
	@Autowired
	private HttpServletRequest request;
	
	@PostMapping("/tableInfo")
	public JsonObject tableInfo() throws Exception{
		JsonObject jsonObject = new JsonObject();
		boolean success = false;
		
		Map<String,Object> webParam = WebParam.changeWebParam(request);
		String tablename = webParam.get("searchvalue") == null?"":webParam.get("searchvalue").toString();
		List<Map<String,Object>> tablesInfo = tablesService.getTableInfo(tablename);
		
		if(null == tablesInfo || tablesInfo.size() == 0) {
			jsonObject.setMsg("查无数据");
			return jsonObject;
		}
		
		success = true;
		jsonObject.setMsg("成功");
		jsonObject.setSuccess(success);
		jsonObject.setObj(tablesInfo);
		
		return jsonObject;
	}
	
	@PostMapping("/tableInfoDtl")
	public JsonObject tableInfoDtl() throws Exception{
		JsonObject jsonObject = new JsonObject();
		boolean success = false;
		
		Map<String,Object> webParam = WebParam.changeWebParam(request);
		String tablename = webParam.get("tablename") == null?"":webParam.get("tablename").toString();
		
		if("".equals(tablename)) {
			jsonObject.setMsg("传入参数有误");
			return jsonObject;
		}
		
		List<Map<String,Object>> tablesInfo = tablesService.getTableDtlInfo(tablename);
		
		if(null == tablesInfo || tablesInfo.size() == 0) {
			jsonObject.setMsg("查无数据");
			return jsonObject;
		}
		
		success = true;
		jsonObject.setMsg("成功");
		jsonObject.setSuccess(success);
		jsonObject.setObj(tablesInfo);
		
		return jsonObject;
	}
}
