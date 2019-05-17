/*
*(C) Copyright 2019 	YOLO.
*
* @author USER
* @date May 17, 2019
* 
*/
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entity.Student;

public class StudentController implements Mycontroller {

	private ArrayList<Student> list = new ArrayList<>();
	@Override
	public void create() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên: ");
		String maSoSv = scanner.nextLine();
		System.out.println("Nhập tên sinh viên: ");
		String hoTen = scanner.nextLine();
		System.out.println("Nhập điểm trung bình của sinh viên");
	    String diemTB = scanner.nextLine();
		Student student = new Student(maSoSv, hoTen, diemTB);
		list.add(student);
		
	}

	@Override
	public void readList() {
		System.out.printf("%15s | %15s | %15s\n", "Mã sinh viên","Tên sinh viên","Điểm trung bình");
		for (int i = 0; i < list.size(); i++) {
			Student sinhvien = list.get(i);
			System.out.printf("%15s | %15s | %15s\n", sinhvien.getMaSoSv(), sinhvien.getHoTen(), sinhvien.getDiemTB());
		}
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	
	public void sortDESC() {
		Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getDiemTB().compareTo(o2.getDiemTB());
            }
        });
        // show list students
        for (Student student : list) {
            System.out.println(student.toString());
        }

		
	}

}
