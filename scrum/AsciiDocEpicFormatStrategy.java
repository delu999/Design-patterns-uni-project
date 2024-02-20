package scrum;

import java.util.Collections;

public class AsciiDocEpicFormatStrategy implements EpicFormatStrategy {

	@Override
	public String formatEpic(Epic epic, int indentLevel) {
		String indent = String.join("", Collections.nCopies(indentLevel + 1, "*"));

		return indent
				+ (" ")
				+ (epic.getTitle())
				+ (": ")
				+ (epic.getDescription())
				+ ("\n");
	}
}