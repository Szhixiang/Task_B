package main;

public class Main {
	
	public static void main(String[] args) {

		BuildTarget buildTarget = new BuildTarget();
		configuration config1 = buildTarget.getConfig("build.xml");
		config1.configure();
		configuration config2 = buildTarget.getConfig("build.yaml");
		config2.configure();


	}
}
