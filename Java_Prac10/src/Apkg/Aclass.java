package Apkg;

import Cpkg.Cclass;

public class Aclass extends Cclass{

	public String name;
	public void show()
	{
		System.out.println("Apkg_show");
	}
	
	public static void main(String[] args) {
		Aclass c = new Aclass();
		c.show();
	}

}
