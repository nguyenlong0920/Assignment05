package exercise02;

class Base extends Exception {
	private static final long serialVersionUID = 1L;

	public Base(String message) {
		super(message);
	}
}

class Level2 extends Base {
	private static final long serialVersionUID = 1L;

	public Level2(String message) {
		super(message);
	}
}

class Level3 extends Level2 {
	private static final long serialVersionUID = 1L;

	public Level3(String message) {
		super(message);
	}
}

class A {
	public void method() throws Base {
		throw new Base("Base exception thrown by A");
	}
}

class B extends A {
	@Override
	public void method() throws Level2 {
		throw new Level2("Level 2 exception thrown by B");
	}
}

class C extends B {
	@Override
	public void method() throws Level3 {
		throw new Level3("Level 3 exception thrown by C");
	}
}

public class ExceptionLevel {
	public static void main(String[] args) {
		A a = new C();
		try {
			a.method();
		} catch (Base e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}