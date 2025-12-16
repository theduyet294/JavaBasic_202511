import java.util.ArrayList;
import java.util.Iterator;

import day2.DecisionMaking;
import day4.GiaoVien;
import day4.GiaoVienTiengAnh;
import day4.GiaoVienTiengAnhNew;
import day4.GiaoVienToan;
import day4.GiaoVienToanNew;

public class Main {

	public static void main(String[] args) {
		run2();
		
//	DecisionMaking decisionMaking = new DecisionMaking();
//	decisionMaking.checkNumber(10);
//	
//	if(decisionMaking.checkNumber1(10)) {
//		System.out.println("n là số chẵn");
//	}
//	decisionMaking.checkNumber2(22);
//	int n = 565;
//	System.out.println("Input an integer between 0 and 1000: "+ n);
//	 	System.out.println("The sum of all digits in "+ n+ " is " + decisionMaking.tinhTong(n));
	
	
	}
	public static void run1() {
		GiaoVienToan giaoVienToan1 = new GiaoVienToan();
		giaoVienToan1.maGV="001";
		giaoVienToan1.hoTen="A01";
		giaoVienToan1.ngaySinh="12/9/2025";
		giaoVienToan1.gioiTinh="Nam";
		giaoVienToan1.monDay="Anh";
		GiaoVienToan giaoVienToan2 = new GiaoVienToan();
		giaoVienToan2.maGV="002";
		giaoVienToan2.hoTen="A02";
		giaoVienToan2.ngaySinh="13/9/2025";
		giaoVienToan2.gioiTinh="Nam";
		giaoVienToan2.monDay="Anh1";
		GiaoVienToan giaoVienToan3 = new GiaoVienToan();
		giaoVienToan3.maGV="003";
		giaoVienToan3.hoTen="A03";
		giaoVienToan3.ngaySinh="14/9/2025";
		giaoVienToan3.gioiTinh="Nam";
		giaoVienToan3.monDay="Anh2";
		
		GiaoVienTiengAnh giaoVienTiengAnh = new GiaoVienTiengAnh();
		giaoVienTiengAnh.maGV="001";
		giaoVienTiengAnh.hoTen="A01";
		giaoVienTiengAnh.ngaySinh="12/9/2025";
		giaoVienTiengAnh.gioiTinh="Nam";
		giaoVienTiengAnh.monDay="Anh";
		GiaoVienTiengAnh giaoVienTiengAnh2 = new GiaoVienTiengAnh();
		giaoVienTiengAnh2.maGV="002";
		giaoVienTiengAnh2.hoTen="A02";
		giaoVienTiengAnh2.ngaySinh="13/9/2025";
		giaoVienTiengAnh2.gioiTinh="Nam";
		giaoVienTiengAnh2.monDay="Anh1";
		GiaoVienTiengAnh giaoVienTiengAnh3 = new GiaoVienTiengAnh();
		giaoVienTiengAnh3.maGV="003";
		giaoVienTiengAnh3.hoTen="A03";
		giaoVienTiengAnh3.ngaySinh="14/9/2025";
		giaoVienTiengAnh3.gioiTinh="Nam";
		giaoVienTiengAnh3.monDay="Anh2";
		
		ArrayList<GiaoVienToan> giaoVienToans = new ArrayList<GiaoVienToan>();
		giaoVienToans.add(giaoVienToan1);
		giaoVienToans.add(giaoVienToan2);	
		giaoVienToans.add(giaoVienToan3);
		ArrayList<GiaoVienTiengAnh> giaoVienTiengAnhs = new ArrayList<GiaoVienTiengAnh>();
		giaoVienTiengAnhs.add(giaoVienTiengAnh);
		giaoVienTiengAnhs.add(giaoVienTiengAnh2);	
		giaoVienTiengAnhs.add(giaoVienTiengAnh3);
		for(GiaoVienToan gv:giaoVienToans) {
			gv.inThongtin();
		}
		for(GiaoVienTiengAnh gv:giaoVienTiengAnhs) {
			gv.inThongtin();
		}
	}
	public static void run2() {
		GiaoVien giaoVienToan1 = new GiaoVienToanNew();
		giaoVienToan1.maGV="001";
		giaoVienToan1.hoTen="A01";
		giaoVienToan1.ngaySinh="12/9/2025";
		giaoVienToan1.gioiTinh="Nam";
		giaoVienToan1.monDay="Anh";
		GiaoVien giaoVienToan2 = new GiaoVienToanNew();
		giaoVienToan2.maGV="002";
		giaoVienToan2.hoTen="A02";
		giaoVienToan2.ngaySinh="13/9/2025";
		giaoVienToan2.gioiTinh="Nam";
		giaoVienToan2.monDay="Anh1";
		GiaoVien giaoVienToan3 = new GiaoVienToanNew();
		giaoVienToan3.maGV="003";
		giaoVienToan3.hoTen="A03";
		giaoVienToan3.ngaySinh="14/9/2025";
		giaoVienToan3.gioiTinh="Nam";
		giaoVienToan3.monDay="Anh2";
		
		GiaoVien giaoVienTiengAnh = new GiaoVienTiengAnhNew();
		giaoVienTiengAnh.maGV="001";
		giaoVienTiengAnh.hoTen="A01";
		giaoVienTiengAnh.ngaySinh="12/9/2025";
		giaoVienTiengAnh.gioiTinh="Nam";
		giaoVienTiengAnh.monDay="Anh";
		
		GiaoVien giaoVienTiengAnh2 = new GiaoVienTiengAnhNew();
		giaoVienTiengAnh2.maGV="002";
		giaoVienTiengAnh2.hoTen="A02";
		giaoVienTiengAnh2.ngaySinh="13/9/2025";
		giaoVienTiengAnh2.gioiTinh="Nam";
		giaoVienTiengAnh2.monDay="Anh1";
		
		GiaoVien giaoVienTiengAnh3 = new GiaoVienTiengAnhNew();
		giaoVienTiengAnh3.maGV="003";
		giaoVienTiengAnh3.hoTen="A03";
		giaoVienTiengAnh3.ngaySinh="14/9/2025";
		giaoVienTiengAnh3.gioiTinh="Nam";
		giaoVienTiengAnh3.monDay="Anh2";
		
		ArrayList<GiaoVien> giaoViens = new ArrayList<GiaoVien>();
		giaoViens.add(giaoVienToan1);
		giaoViens.add(giaoVienToan2);
		giaoViens.add(giaoVienToan3);
		giaoViens.add(giaoVienTiengAnh);
		giaoViens.add(giaoVienTiengAnh2);
		giaoViens.add(giaoVienTiengAnh3);
		
		for(GiaoVien gv :giaoViens) {
			gv.inThongtin();
		}
		
	}

}
