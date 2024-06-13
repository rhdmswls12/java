package com.ureca.pack2;

import com.ureca.pack1.Parent;

public class Child extends Parent{
	void callTest() {
		m1();
		m2(); // 다른 패키지이지만 자식이므로 에러 발생x
//		m3(); // 다른 패키지이므로 에러
//		m4(); // 에러
	}
}