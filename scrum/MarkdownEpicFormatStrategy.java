package scrum;

import java.util.Collections;

public class MarkdownEpicFormatStrategy implements EpicFormatStrategy {

	@Override
	public String formatEpic(Epic epic, int indentLevel) {
		String indent = String.join("", Collections.nCopies(indentLevel, "\t"));
		return indent +
				"- **" +
				epic.getTitle()
				+ ":** "
				+ epic.getDescription()
				+ "\n";
	}

}