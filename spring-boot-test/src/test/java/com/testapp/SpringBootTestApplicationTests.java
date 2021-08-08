package com.testapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doThrow;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.testapp.controllers.GreetController;
import com.testapp.controllers.MobileController;
import com.testapp.exceptions.MobileNotFoundException;
import com.testapp.model.Mobile;
import com.testapp.service.MobileService;

@SpringBootTest
class SpringBootTestApplicationTests {

	@InjectMocks
	GreetController greetController;
	
	@InjectMocks
	MobileController mobileController;
	
	@Mock
	MobileService mobileService;
	
	List<Mobile> mobileByBrand;
//	List<Mobile> mobileByModelBrand;
	Mobile mobile1,mobile2,mobile3,mobile4,mobile5;
	
	@BeforeEach
	public void setup() {
		System.out.println("Set up data");
		
		mobile1=new Mobile(123,"A50s","Samsung",12000.0);
		mobile2=new Mobile(133,"A70","Samsung",19000.0);
		mobile3=new Mobile(163,"Iphone12","Apple",12000.0);
		mobile4=new Mobile(143,"N65","Micromax",12000.0);
		mobile5=new Mobile(153,"U1","Micromax",12000.0);
		mobileByBrand=Arrays.asList(mobile1,mobile2,mobile3,mobile4,mobile5);
	}
	
	
	
	
//	@Test
	void contextLoads() {
	}

@Test
public void testGreetMessage() {
	String result=greetController.greetMsg();
	assertEquals("Have a great day",result);
}
	

@Test
public void testByBrand() {
	
	String brand="Samsung";
	Mockito.when(mobileService.getByBrand(brand)).thenReturn(Arrays.asList(mobile2,mobile1));
	List<Mobile> mobileList=mobileController.getByBrand(brand);
	assertEquals(Arrays.asList(mobile1,mobile2),mobileList);
}

@Test
public void testNullByBrand() {
	String brand="Sams";
	Mockito.when(mobileService.getByBrand(brand)).thenReturn(null);
	List<Mobile> mobilelist=mobileController.getByBrand(brand);
	assertNull(mobilelist);
	
}


@Test
public void testEmptyByBrand() {
	String brand="Zebronics";
	doThrow(new MobileNotFoundException("No mobile found for this brand")).when(mobileService).getByBrand(brand);
//	Mockito.when(mobileService.getByBrand(brand)).thenThrow( new MobileNotFoundException("No mobile found for this brand"));
	assertThrows(MobileNotFoundException.class,()->{
		mobileController.getByBrand(brand);
	});
}




@Test
public void testEmptyByBrand2() {
	String brand="Zebronics";
	Mockito.when(mobileService.getByBrand(brand)).thenReturn(Arrays.asList());
	assertThrows(MobileNotFoundException.class,()->{
		mobileController.getByBrand(brand);
	});
}





@Test
public void testByBrandModel() {
	String brand="Samsung";
	String model="A70";
	Mockito.when(mobileService.getByBrandAndModel(brand, model)).thenReturn(Arrays.asList(mobile2));
	List<Mobile> mobileList=mobileController.getByBrandAndModel(brand, model);
	assertEquals(Arrays.asList(mobile2),mobileList);
}

@Test
public void testByNullBrandModel() {
	String brand="Zebronics";
	String model="Zcs360";
	Mockito.when(mobileService.getByBrandAndModel(brand, model)).thenReturn(null);
	List<Mobile> mobileList=mobileController.getByBrandAndModel(brand, model);
	assertNull(mobileList);
}


@Test
public void testByEmptyBrandModel() {
	String brand="Zebronics";
	String model="Zcs360";
	Mockito.when(mobileService.getByBrandAndModel(brand, model)).thenThrow(new MobileNotFoundException("No mobile found for this brand and model") );
    assertThrows(MobileNotFoundException.class,()->{
    	mobileController.getByBrandAndModel(brand, model);
    });
}


@Test
public void testById() {
	Integer mobileId=133;
	Mockito.when(mobileService.getById(mobileId)).thenReturn(mobile2);
	Mobile mobile=mobileService.getById(mobileId);
	assertEquals(mobile2, mobile);
}


@Test
public void testEmptyById() {
	Integer mobileId=1999;
	Mockito.when(mobileService.getById(mobileId)).thenThrow(new MobileNotFoundException("No mobile found for this Id") );
	assertThrows(MobileNotFoundException.class,()->{
		mobileController.getById(mobileId);
	});
}


@Test
public void testNullById() {
	Integer mobileId=1999;
	Mockito.when(mobileService.getById(mobileId)).thenReturn(null);
	Mobile mobile=mobileController.getById(mobileId);
	assertNull(mobile);
}

}
