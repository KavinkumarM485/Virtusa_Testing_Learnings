
public interface Skills 
{
  void fly();
  void run();
  void sing();
  void dance();
}

public abstarct class IIT implements Skills {
	@Override
	public void fly() {
		System.out.println("flying....");
	}

	@Override
	public void run() {
		System.out.println("running....");
	}
}

public class MIT extends IIT
{
  @Override
	public void sing() {
		System.out.println("sing.....");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("dance...");
	}
}

public class Student
{
  public static Features obj=null;     
	public static void main(String[] args) 
  {
	  obj = new MIT();
		obj.fly();
		obj.run();
		obj.sing();
		obj.dance();
	}

}
