package design_pattern.Chain_Of_Responsibility;

public class NoSupport extends Support {
	public NoSupport(String name) {
		super(name);
	}
	
	@Override
	protected boolean resolve(Trouble trouble) {
		return false; //自分は解決しない
	}
}
