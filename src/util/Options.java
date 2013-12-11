package util;

import com.google.gson.annotations.Expose;

public class Options {
	@Expose
	private String DisplayText;
	@Expose
	private int Value;

	public String getDisplayText() {
		return DisplayText;
	}

	public void setDisplayText(String displayText) {
		DisplayText = displayText;
	}

	public int getValue() {
		return Value;
	}

	public void setValue(int value) {
		Value = value;
	}

}
