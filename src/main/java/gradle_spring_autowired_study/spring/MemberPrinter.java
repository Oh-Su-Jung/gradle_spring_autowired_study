package gradle_spring_autowired_study.spring;

public class MemberPrinter {
	public void print(Member member) {
		System.out.printf("?šŒ?› ? •ë³? : ?•„?´?”” = %d, ?´ë©”ì¼ = %s, ?´ë¦? = %s, ?“±ë¡ì¼ = %tF\n",
				member.getId(), member.getEmail(), member.getName(), member.getRegisterDateTime());
	}
}
