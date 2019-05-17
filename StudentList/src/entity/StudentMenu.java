/*
*(C) Copyright 2019 	YOLO.
*
* @author USER
* @date May 17, 2019
* 
*/
package entity;

import java.util.Scanner;

import controller.Mycontroller;

public class StudentMenu implements Menu {

	@Override
	public void generateMenu(Mycontroller controller) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			    System.out.println("-------------Menu----------------");
	            System.out.println("1. Thêm mới sinh viên.");
	            System.out.println("2. Hiển thị danh sách sinh viên.");
	            System.out.println("3. Điểm trung bình của học sinh.");
	            System.out.println("4. Thoát chương trình.");
	            System.out.println("---------------------------------");
	            System.out.println("Nhập lựa chọn của bạn: ");
	            int choise = scanner.nextInt();
	            
	            switch (choise) {
	                 case 1: 
	                	 System.out.println("Thêm mới sinh viên.");
	                	 controller.create();
	                     break;
	                 case 2: 
	                	 System.out.println("Hiển thị danh sách sinh viên.");
	                	 controller.readList();
	                	 break;
	                 case 3:
	                	 System.out.println("Điểm trun bình của sinh viên.");
	                	 controller.sortDESC();
	                	 break;
	                 case 4:
	                	 System.out.println("Thoát.");
	                	 break;
	                default :
	                	System.out.println("Lựa chọ sai, vui lòng nhập lại trong khoảng từ 1 đến 4.");
	                	break;
	            }
	            
	            if (choise == 4) {
	            	System.out.println("Hẹn gặp lại!");
	            	break;
	            }
		}
		
	}

}
