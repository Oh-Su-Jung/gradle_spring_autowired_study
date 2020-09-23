package gradle_spring_autowired_study.spring;

public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public void print() {
		System.out.printf("?ด ?๋ก๊ทธ?จ? ๋ฒ์ ?? %d.%d???ค. \n\n", majorVersion, minorVersion);
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
}
