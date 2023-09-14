package design_pattern.Decorator;

//「飾り枠」を表す抽象クラス
public abstract class Border extends Display {
	protected Display display;
	
	protected Border(Display display) {
		this.display = display;
	}
}
