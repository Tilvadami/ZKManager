package com.zkmanager.po;

public class Person {
	private int id;
	private String name;
	private String phone;
	private String password;
	private boolean available;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return '{' +
                "id:" + id +
                ", name:" + name +
                ", phone:" + phone +
                ", password:" + password +
                ", available:" + available +
                '}';
	}
}
