package gradle_spring_autowired_study.spring;

public class MemberPrinter {
	public void print(Member member) {
		System.out.printf("?��?�� ?���? : ?��?��?�� = %d, ?��메일 = %s, ?���? = %s, ?��록일 = %tF\n",
				member.getId(), member.getEmail(), member.getName(), member.getRegisterDateTime());
	}
}
