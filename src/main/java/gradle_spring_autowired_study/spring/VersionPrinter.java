package gradle_spring_autowired_study.spring;

public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public void print() {
		System.out.printf("?�� ?��로그?��?�� 버전?? %d.%d?��?��?��. \n\n", majorVersion, minorVersion);
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
}
