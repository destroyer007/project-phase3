package com.shubham.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shubham.learn.model.CompanyModelDto;
import com.shubham.learn.model.IpoModelDto;
import com.shubham.learn.model.StockExchangeDto;
import com.shubham.learn.model.StockPriceDto;
import com.shubham.learn.model.UserModel;
import com.shubham.learn.model.UserModelDto;

@RestController
@RequestMapping("/feign")
public class FeignController {
	
	@Autowired
	private CompanyClient companyClient;
	
	@Autowired
	private IpoClient ipoClient;
	
	@Autowired
	private StockExchangeClient stockExchangeClient;
	
	@Autowired
	private StockPriceClient stockPriceClient;
	
	@Autowired
	private UserClient userClient;
	
	@GetMapping("/company")
//	@HystrixCommand(fallbackMethod = "defaultResponse")
	public Iterable<CompanyModelDto> getAllComapny() {
		return companyClient.getAll();
	}
	
	@PostMapping("/company")
//	@HystrixCommand(fallbackMethod = "defaultResponse")
	public CompanyModelDto addCompany(@RequestBody CompanyModelDto companyModelDto) {
		return companyClient.create(companyModelDto);
	}
//	
	@GetMapping("/users")
//	@HystrixCommand(fallbackMethod = "defaultResponse")
	public Iterable<UserModel> getUser() {
		return userClient.getAll();
	}
	
	@PostMapping("/users")
//	@HystrixCommand(fallbackMethod = "defaultResponse")
	public UserModelDto addUser(@RequestBody UserModelDto userModelDto) {
		return userClient.addUser(userModelDto);
	}
	
	@GetMapping("/ipos")
	public Iterable<IpoModelDto> getAllIpo(){
		return ipoClient.getAllIpo();
	}
	
	@PostMapping("/ipos")
	public IpoModelDto addIpo(@RequestBody IpoModelDto ipoModelDto) {
		return ipoClient.addIpo(ipoModelDto);
	}
	
	@GetMapping("/ipo/{cname}")
	public Iterable<IpoModelDto> getIpoByCompany(@PathVariable String cname){
		return ipoClient.getIpoByCompany(cname);
	}
	
	
	@GetMapping("/stockExchange")
	public Iterable<StockExchangeDto> getAllExchangeDetails(){
		return stockExchangeClient.getAll();
	}
	
	@PostMapping("/stockExchange")
	public StockExchangeDto addExchange(@RequestBody StockExchangeDto stockExchangeDto) {
		return stockExchangeClient.addExchange(stockExchangeDto);
	}
	
	@GetMapping("/stockPrice")
	public Iterable<StockPriceDto> getStock(){
		return stockPriceClient.getAll();
	}
	
	@PostMapping("/stockPrice")
	public StockPriceDto addStock(@RequestBody StockPriceDto stockPriceDto) {
		return stockPriceClient.addStock(stockPriceDto);
	}
//	public ResponseEntity<String> defaultResponse(String error){
//		System.out.println("You are seeing this fallback response because the underlying microservice is down.");
//		error = "ERROR microservice is down.....";
//		return new ResponseEntity<>(error,HttpStatus.INTERNAL_SERVER_ERROR);
//	}
}
