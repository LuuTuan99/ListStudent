/*
*(C) Copyright 2019 	YOLO.
*
* @author USER
* @date May 17, 2019
* 
*/
package controller;

import entity.Menu;
import entity.StudentMenu;

public class Main {
	public static void main(String[] args) {
		 Mycontroller controller = new StudentController();
	     Menu menu = new StudentMenu();
	     menu.generateMenu(controller);
	}

}
