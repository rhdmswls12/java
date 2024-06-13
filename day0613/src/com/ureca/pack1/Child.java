package com.ureca.pack1;

public class Child extends Parent{
	void callTest() {
//		this.m1();
		m1(); // 자식이므로 바로 호출 가능(this.가 생략되어 있다) -> child에서 찾다가 없으면 parent로 올라감
		m2();
		m3(); 
//		m4(); // 에러
	}
}