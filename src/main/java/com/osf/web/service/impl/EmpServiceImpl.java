package com.osf.web.service.impl;

import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.sound.sampled.AudioFormat.Encoding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.CharacterEncodingFilter;

import com.osf.web.dao.EmpDAO;
import com.osf.web.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpDAO edao;
	
	public boolean loginEmp(Map<String, String> emp, HttpSession hs) {
		Map<String,String> dbEmp = edao.selectEmpById(emp);
		//emp = edao.selectEmpById(emp);
	
		if( dbEmp==null || !dbEmp.get("PWD").equals(emp.get("pwd"))) {
			return false;
		}
		
		if("2".equals(dbEmp.get("LVL"))) {
			emp.put("lvl", "1");
			hs.setAttribute("empList", edao.selectEmpList(emp));
		}
		
		hs.setAttribute("emp",dbEmp);
		return true;
	}

}
