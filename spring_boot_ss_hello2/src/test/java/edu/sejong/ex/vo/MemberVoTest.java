package edu.sejong.ex.vo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberVoTest {

	@Test
	void testMemberVo() {
		MemberVo memberVo = new MemberVo();
		System.out.println(memberVo); 
		
		memberVo.setAge(10);
		memberVo.setName("홍길동");
		
		assertNotNull(memberVo);
		//assertEquals(memberVo.getAge(), 0);
		assertEquals(memberVo.getAge(), 10);
		assertEquals(memberVo.getName(), "홍길동");
		assertTrue(memberVo.getName().equals("홍길동"));
		
	}
	
	@Test
	void testMemberArgs() {
		MemberVo memberVo = new MemberVo("홍길동","abcd","1234","email@email.com",13);
		System.out.println(memberVo); 		
	}

}
