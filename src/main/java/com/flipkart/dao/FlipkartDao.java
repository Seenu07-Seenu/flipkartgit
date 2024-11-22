package com.flipkart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.Flipkart;
import com.flipkart.repository.FlipkartRepository;

@Repository
public class FlipkartDao {

	@Autowired
	FlipkartRepository fr;

	public String post(List<Flipkart> li) {
		fr.saveAll(li);
		return "Saved SuccessFully";
	}

	public List<Flipkart> get() {
		return fr.findAll() ;
	}

	public Flipkart getp(int a) {
		return fr.findById(a).get();
	}
	
}
