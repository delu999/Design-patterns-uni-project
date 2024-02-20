package scrum;

import java.util.Iterator;

public class UserStoryCounterVisitor implements ScrumVisitor {

	private int countUserStory = 0;

	@Override
	public void visitUserStory(UserStory userStory) {
		countUserStory++;
	}

	@Override
	public void visitEpic(Epic epic) {
		Iterator<ScrumItem> iterator = epic.iterator();
		while (iterator.hasNext())
			iterator.next().accept(this);
	}

	public int getCountUserStory() {
		return countUserStory;
	}

}
