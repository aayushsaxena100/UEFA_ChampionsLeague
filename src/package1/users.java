package package1;



public class users {

	static String name;
	static String userName;
	static String password;

	public int getData(String userName,String password) {
		loginProcess p = new loginProcess(userName, password);
		int i=p.process();
		return i;
	}
}