package gradle_spring_autowired_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import gradle_spring_autowired_study.spring.ChangePasswordService;
import gradle_spring_autowired_study.spring.MemberDao;
import gradle_spring_autowired_study.spring.MemberInfoPrinter;
import gradle_spring_autowired_study.spring.MemberListPrinter;
import gradle_spring_autowired_study.spring.MemberPrinter;
import gradle_spring_autowired_study.spring.MemberRegisterService;
import gradle_spring_autowired_study.spring.VersionPrinter;

@Configuration
public class AppCtx {
	@Bean
	public MemberDao MemberDao() {
		return new MemberDao();
	}

	@Bean
	public MemberRegisterService MemberRegSvc() {
		return new MemberRegisterService(MemberDao());
	}

	@Bean
	public ChangePasswordService ChangePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(MemberDao());
		return pwdSvc;
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(MemberDao(), memberPrinter());
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemDao(MemberDao());
		infoPrinter.setPrinter(memberPrinter());
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
