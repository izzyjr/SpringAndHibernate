package com.mesa.springscraper.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coin")

public class Coin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="number_order")
	private int numberOrder;
	
	@Column(name="symbol")
	private String symbol;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="percent_change")
	private String percentChange;
	
	@Column(name="market_cap")
	private String marketCap;
	
	@Column(name="volume_currency")
	private String volumeCurrency;
	
	@Column(name="circulating_supply")
	private String circulatingSupply;
	
	public Coin() {
		
	}

	public int getNumberOrder() {
		return numberOrder;
	}

	public void setNumberOrder(int numberOrder) {
		this.numberOrder = numberOrder;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(String percentChange) {
		this.percentChange = percentChange;
	}

	public String getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	public String getVolumeCurrency() {
		return volumeCurrency;
	}

	public void setVolumeCurrency(String volumeCurrency) {
		this.volumeCurrency = volumeCurrency;
	}

	public String getCirculatingSupply() {
		return circulatingSupply;
	}

	public void setCirculatingSupply(String circulatingSupply) {
		this.circulatingSupply = circulatingSupply;
	}

	@Override
	public String toString() {
		return "Coin [numberOrder=" + numberOrder + ", symbol=" + symbol + ", name=" + name + ", price=" + price
				+ ", percentChange=" + percentChange + ", marketCap=" + marketCap + ", volumeCurrency=" + volumeCurrency
				+ ", circulatingSupply=" + circulatingSupply + "]";
	}
	
	

}
