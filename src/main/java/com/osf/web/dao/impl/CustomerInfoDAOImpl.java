package com.osf.web.dao.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.osf.web.dao.CustomerInfoDAO;

@Repository
public class CustomerInfoDAOImpl implements CustomerInfoDAO {

	@Autowired
	private SqlSession ss;

	public List<Map<String, String>> selectCustomerList() {
		return ss.selectList("customer.selectCustomerList");
	}

	public Map<String, String> selectCustomer(Integer ciNum) {
		return null;
	}

	public Map<String, String> selectCustomerById(String ciId) {
		return null;
	}

	public int insertCustomer(Map<String, String> ci) {
		return ss.insert("customer.insertCustomer", ci);
	}

	public int updateCustomer(Map<String, String> ci) {

		return 0;
	}

	public int deleteCustomer(Integer ciNum) {

		return 0;
	}

	public int deleteCustomerById(String ciId) {

		return 0;
	}

}
