package design_pattern.Decorator;

public class StringDisplay extends Display{
	private String string; //表示文字列
	
	public StringDisplay(String string) {
		this.string = string;
	}
	
	@Override
	public int getColumns() {
		return string.length();
	}
	
	@Override
	public int getRows() {
		return 1; //行数は1
	}
	
	public String getRowText(int row) {
		if (row != 0) {
			throw new IndexOutOfBoundsException();
		}
		return string;
	}
}
