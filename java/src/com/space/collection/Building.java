package com.space.collection;

import java.util.Objects;

public class Building {
	
	private String name;
	private String addr;
	
	public Building(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Building [name=" + name + ", addr=" + addr + "]";
	}

	@Override
	public int hashCode() {
		//
		return Objects.hash(addr, name);
	}

	@Override
	public boolean equals(Object obj) {
		//
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Building other = (Building) obj;
		return Objects.equals(addr, other.addr) && Objects.equals(name, other.name);
	}

}
