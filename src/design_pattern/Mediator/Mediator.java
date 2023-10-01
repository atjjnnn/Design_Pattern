package design_pattern.Mediator;

public interface Mediator {
	//Colleagueたちを生成する
	public abstract void createColleages();
	
	//Colleagueの状態が変化した時に呼ばれる
	public abstract void colleagueChanged();
}
