package com.rafalleszko.hello;

import com.rafalleszko.name.NameProvider;

public class Main {
	public static void main(String [] args) {
		String name = NameProvider.name();
		System.out.println("\nHello " + name + "\n");
	}
}
