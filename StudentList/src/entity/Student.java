/*
*(C) Copyright 2019 	YOLO.
*
* @author USER
* @date May 17, 2019
* 
*/
package entity;

public class Student {
	private String maSoSv;
	private String hoTen;
	private String diemTB;	
	
	public Student() {
	
	}
	
	
	public Student(String maSoSv, String hoTen, String diemTB) {
		this.maSoSv = maSoSv;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}


	public String getMaSoSv() {
		return maSoSv;
	}
	public void setMaSoSv(String maSoSv) {
		this.maSoSv = maSoSv;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(String diemTB) {
		this.diemTB = diemTB;
	}


	@Override
	public String toString() {
		return "Student [maSoSv=" + maSoSv + ", hoTen=" + hoTen + ", diemTB=" + diemTB + "]";
	}
	
	

}
