package com.osf.web.dao;

import java.util.List;
import java.util.Map;

public interface CustomerInfoDAO {

	List<Map<String,String>> selectCustomerList();
	Map<String,String> selectCustomer(Integer ciNum);
	Map<String,String> selectCustomerById(String ciId);
	int insertCustomer(Map<String,String> ci);
	int updateCustomer(Map<String,String> ci);
	int deleteCustomer(Integer ciNum);
	int deleteCustomerById(String ciId);
	
}
