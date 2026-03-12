package Slide1;

public class Cat extends Animal {
	public Cat(String name, int age) {
		super(name,age);
	}
	
	public void bark(String name) {
		System.out.println(name + ": Meow! Meow!");
	}
}
