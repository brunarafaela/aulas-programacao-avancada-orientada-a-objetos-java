package com.example.demo.test;

import javax.persistence.Persistence;

public class TesteCriarBaseETabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("bossiniPU");
	}

}
