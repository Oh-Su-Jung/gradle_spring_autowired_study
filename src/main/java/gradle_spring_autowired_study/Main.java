package gradle_spring_autowired_study;

import gradle_spring_autowired_study.spring.ChangePasswordService;
import gradle_spring_autowired_study.spring.MemberDao;
import gradle_spring_autowired_study.spring.MemberRegisterService;

public class Main {
	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regSvc = new MemberRegisterService(memberDao);
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
	}

}
