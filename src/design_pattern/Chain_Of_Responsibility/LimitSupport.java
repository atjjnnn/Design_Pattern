package design_pattern.Chain_Of_Responsibility;

public class LimitSupport extends Support {
	private int limit; //この番号未満なら解決可能
	
	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}
	
	@Override
	protected boolean resolve (Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		} else {
			return false;
		}
	}

}
