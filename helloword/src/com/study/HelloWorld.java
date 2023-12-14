package com.study;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloWorld {


	public static void main(String[] args) {
		
		Student st1 = new Student("홍길동", "945607");
		Student st2 = new Student("박구름", "154602");
		Student st3 = new Student("홍길남", "0544604");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);

		for(Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("계속검색을원하면 y , 종료하고싶으면 n");
			String input = scan.next();
			
			
			if(input.equals("y")) {
				System.out.println("학생이름 검색");
				String name = scan.next();
				boolean flag = false;
				
				for(Student stu : list) {
					if(stu.getName().equals(name)) {
						System.out.println(name+"의 학번은"+stu.getNo());
						flag = true;
					}
				}
				if(!flag) {
					System.out.println("없는 학생입니다.");
				}
				
			}else if(input.equals("n")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();
			
	}
}
