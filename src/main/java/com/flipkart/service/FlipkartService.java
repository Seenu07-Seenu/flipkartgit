package com.flipkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.dao.FlipkartDao;
import com.flipkart.entity.Flipkart;

@Service
public class FlipkartService {

	@Autowired
	FlipkartDao fd;

	public String post(List<Flipkart> li) {
		li.forEach(x -> {
			int a = x.getPrice() + (x.getPrice() * x.getOffer() / 100);
			x.setNetAmount(a + x.getDeliveryAmount());
		});

		return fd.post(li);
	}

	public List<Flipkart> get() {
		return fd.get();
	}

	public Flipkart getp(int a) {
		return fd.getp(a);
	}

}
