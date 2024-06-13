package com.ureca.pack2;

import com.ureca.pack1.Parent; // 다른 패키지에 있으므로 import 필요

public class Other {
	void callTest() {
		Parent p = new Parent();
		p.m1();
//		p.m2(); // 다른 패키지이므로 에러
//		p.m3(); // 다른 패키지이므로 에러
//		p.m4(); // 다른 클래스이므로 에러
	}
}