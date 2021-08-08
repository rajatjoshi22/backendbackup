package com.testapp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.testapp.model.Mobile;
@Service
public class MovieServiceImpl implements MobileService {

	@Override
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return showMobiles();
	}

	@Override
	public List<Mobile> getByBrand(String brand) {
		// TODO Auto-generated method stub
		return showMobiles().stream().filter((mobile)->mobile.getBrand().equals(brand)).collect(Collectors.toList());
	}

	@Override
	public List<Mobile> getByBrandAndModel(String brand, String model) {
		// TODO Auto-generated method stub
		return showMobiles().stream().filter((mobile)->mobile.getBrand().equals(brand)&& mobile.getModel().equals(model)).collect(Collectors.toList());
	}

	@Override
	public Mobile getById(Integer mobileId) {
		// TODO Auto-generated method stub
		return showMobiles().stream().filter((mobile)->mobile.getMobileid().equals(mobileId)).findFirst().get();
	}
	
	
	private List<Mobile> showMobiles(){
		return Arrays.asList(new Mobile(123,"A50s","Samsung",12000.0),
				new Mobile(133,"A70","Samsung",19000.0),
				new Mobile(143,"N65","Micromax",12000.0),
				new Mobile(153,"U1","Micromax",12000.0),
				new Mobile(163,"Iphone12","Apple",12000.0)
				
				
				);
	}

}
