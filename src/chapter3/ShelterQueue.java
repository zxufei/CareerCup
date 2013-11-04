package chapter3;
//import dataStructure.MyQueue;
import java.util.*;

public class ShelterQueue {

	/**3.7
	* @param args
	 * An animal shelter holds only dogs and cats, and operates on a strictly
	 * "first in, first out"basis. People must adopt either the "oldest"(based on arrival time)
	 * of all animals at the shelter, or they can select whether they would prefer
	 * a dog or a cat(and will receive the oldest animal of that type).They cannot select
	 * which specific animal they would like. Create the data structures to maintain this system
	 * and implement operations such as enqueue, dequeueAny, deququeDog and deququeCat. 
	 * You may use the built-in Linked list data structure.
	 */
	public class Animal{
		String name = null;
		int code = 0;
		
		public Animal(){
			
		}
		
		public Animal(String n){
			name = n;
		}	
	}
	
	
	public class Dog extends Animal{
		public Dog(String n){
			super(n);
		}
	}
	
	public class Cat extends Animal{
		public Cat(String n){
			super(n);
		}
	}
	
	
	int order = 0;
	LinkedList<Cat> cats = new LinkedList<Cat>();
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	
	public void enqueue(Animal a){
		if(a instanceof Cat){
			cats.add((Cat) a);
			order++;
			a.code = order;
		}
		else{
			dogs.add((Dog) a);
			order++;
			a.code = order;
		}
	}
	
	public String dequeueDog(){
		if(dogs.isEmpty()){
			System.out.println("No dogs.");
			return null;
		}
		return dogs.pollFirst().name;
	}
	
	public String dequeueCat(){
		if(cats.isEmpty()){
			System.out.println("No cats.");
			return null;
		}
		return cats.pollFirst().name;
	}
	
	public String dequeueAny(){
		
		if(!dogs.isEmpty() && !cats.isEmpty())  {
			if(dogs.getFirst().code < cats.getFirst().code){
				return dogs.pollFirst().name;
			}
			else{
				return cats.pollFirst().name;
			}
		}
		else{
			if(dogs.isEmpty() && cats.isEmpty()){
				System.out.println("No animal.");
				return null;
			}
			else{
				if(dogs.isEmpty()) return cats.pollFirst().name;
				else return dogs.pollFirst().name;
			}
		}
			
		

	
	}
	
	public void print(){
		if(!cats.isEmpty() || !dogs.isEmpty()){
		System.out.print("Cats:");
		for (Animal c:cats){
			System.out.print(c.name+" ");
		}
		System.out.println();
		
		System.out.print("Dogs:");
		for(Animal d:dogs){
			System.out.print(d.name+" ");
		}
		System.out.println();
		System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShelterQueue a = new ShelterQueue();
		a.enqueue(a.new Cat("lily"));
		a.enqueue(a.new Dog("dd"));
		a.enqueue(a.new Dog("ss"));
		a.enqueue(a.new Cat("gg"));
		a.enqueue(a.new Cat("tt"));
		a.print();
		a.dequeueCat();
		a.print();
		a.dequeueCat();
		a.print();
		a.dequeueCat();
		a.print();
		a.dequeueCat();
		a.print();
		a.dequeueAny();
		a.print();
		a.dequeueAny();
		a.print();
	}

}
