package scrum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Epic extends ScrumItem {

	private Collection<ScrumItem> contents = new ArrayList<>();

	public Epic(String title, String description) {
		super(title, description);
	}

	public void add(ScrumItem component) {
		contents.add(component);
	}

	public void remove(ScrumItem component) {
		contents.remove(component);
	}

	@Override
	public int getStoryPoints() {
		return contents.stream()
				.mapToInt(ScrumItem::getStoryPoints)
				.sum();
	}

	public Iterator<ScrumItem> iterator() {
		return contents.iterator();
	}

	@Override
	public void accept(ScrumVisitor visitor) {
		visitor.visitEpic(this);
	}

	// package-private, for testing
	Collection<ScrumItem> getContents() {
		return contents;
	}

}