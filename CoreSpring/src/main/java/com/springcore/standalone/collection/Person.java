package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> friends;
	private Map<String,Integer> feestructure;
	private Properties properties;

	public Properties getProps() {
		return properties;
	}

	public void setProps(Properties props) {
		this.properties = props;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}

	

	
	

}
