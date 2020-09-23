package gradle_spring_autowired_study.spring;

public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public void print() {
		System.out.printf("?ù¥ ?îÑÎ°úÍ∑∏?û®?ùò Î≤ÑÏ†Ñ?? %d.%d?ûÖ?ãà?ã§. \n\n", majorVersion, minorVersion);
	}

	public void setMajorVersion(int majorVersion) {
		this.majorVersion = majorVersion;
	}

	public void setMinorVersion(int minorVersion) {
		this.minorVersion = minorVersion;
	}
}
