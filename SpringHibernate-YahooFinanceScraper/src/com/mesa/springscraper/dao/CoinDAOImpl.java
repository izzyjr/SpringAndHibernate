package com.mesa.springscraper.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.mesa.springscraper.entity.Coin;

@Repository
public class CoinDAOImpl implements CoinDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Coin> getCoins() {
		
		//clear table
		clearCoinTable();
		
		// get coins from Yahoo finance and save to DB
		saveCoins(coinScraper());
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query
		Query<Coin> theQuery = currentSession.createQuery("from Coin", Coin.class);
				
		// execute query and get result list
		List<Coin> customers = theQuery.getResultList();
				
		// return the results
		return customers;
		
	} 
	
	public List<Coin> coinScraper() {
		
		List<Coin> coins = new ArrayList<Coin>();
		
		System.setProperty("webdriver.chrome.driver", "/Users/israelmesa/Desktop/ChromeDriver2/chromedriver");
		
		final ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://finance.yahoo.com/cryptocurrencies?count=120");

        //Symbol

        String xpathSymbol = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[1]";
        
        List<WebElement> symbol = new ArrayList<WebElement>();

        symbol = driver.findElements(By.xpath(xpathSymbol));

        //Name

        String xpathName = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[2]";
        
        List<WebElement> name = new ArrayList<WebElement>();

        name = driver.findElements(By.xpath(xpathName));

        //Price

        String xpathPrice = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[3]";
        
        List<WebElement> price = new ArrayList<WebElement>();

        price = driver.findElements(By.xpath(xpathPrice));

        //Percent Change

        String xpathPercentChange = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[5]";
        
        List<WebElement> percentChange = new ArrayList<WebElement>();

        percentChange = driver.findElements(By.xpath(xpathPercentChange));

        //Market Cap

        String xpathMarketCap = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[6]";
        
        List<WebElement> marketCap = new ArrayList<WebElement>();

        marketCap = driver.findElements(By.xpath(xpathMarketCap));

        //Volume in Currency(24hr)

        String xpathVolumeCurrency = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[8]";
        
        List<WebElement> volumeCurrency = new ArrayList<WebElement>();

        volumeCurrency = driver.findElements(By.xpath(xpathVolumeCurrency));

        //Circulating Supply

        String xpathCirculatingSupply = "//*[@id=\"scr-res-table\"]/div[1]/table/tbody/tr[*]/td[10]";
        
        List<WebElement> circulatingSupply = new ArrayList<WebElement>();

        circulatingSupply = driver.findElements(By.xpath(xpathCirculatingSupply));

        int size = name.size();

        for (int i = 0; i < size; i++) {
            coins.add(new Coin((i + 1), 
            			symbol.get(i).getText(),
            			name.get(i).getText(), 
            			price.get(i).getText(), 
            			percentChange.get(i).getText(), 
            			marketCap.get(i).getText(), 
            			volumeCurrency.get(i).getText(), 
            			circulatingSupply.get(i).getText()));
        }
        
        driver.quit();
        
        return coins;
		
	}

	@Override
	@Transactional
	public void saveCoins(List<Coin> listCoins) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// iterate through each coin and create a new one
		for (int i = 0; i < listCoins.size(); i++) {
			
			Coin coin = new Coin(listCoins.get(i).getNumberOrder(),
									listCoins.get(i).getSymbol(),
									listCoins.get(i).getName(),
									listCoins.get(i).getPrice(),
									listCoins.get(i).getPercentChange(),
									listCoins.get(i).getMarketCap(),
									listCoins.get(i).getVolumeCurrency(),
									listCoins.get(i).getCirculatingSupply());
			
			// save each coin
			currentSession.save(coin);		
			
		}	
		
	}

	@Override
	@Transactional
	public void clearCoinTable() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// clear table
		Query theQuery = currentSession.createQuery("delete from Coin");
		
		theQuery.executeUpdate();
		
	}

}
