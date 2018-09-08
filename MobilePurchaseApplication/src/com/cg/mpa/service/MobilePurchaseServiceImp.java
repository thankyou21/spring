package com.cg.mpa.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mpa.dao.*;
import com.cg.mpa.entities.*;
@Transactional
@Service
public class MobilePurchaseServiceImp implements MobilePurchaseService {

	@Autowired
	MobileDao mdao;
	
	@Autowired
	PurchaseDetailDao pdao;
	
	@Override
	public List<Mobile> getAllMobiles() {
		
		return mdao.fetchAllMobiles();
	}

	@Override
	public void insertPurchaseDetails(PurchaseDetails pdetails) {
		pdao.insertPurchaseDetails(pdetails);
	}

}
