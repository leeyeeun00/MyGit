package mygit;

public class A {

	public static void main(String[] args) {
		System.out.println("A.java");
		System.out.println("master A commit");
		System.out.println("devB A.java Commit");
		System.out.println("master Branch <- devB Branch MERGE");
		
		System.out.println("devC Branch A.java");
		System.out.println("master Branch <- devC Branch MERGE");
	}

}
