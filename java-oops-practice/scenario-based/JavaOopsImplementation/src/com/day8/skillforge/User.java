package com.day8.skillforge;

abstract class User {
	protected String name;
	public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}