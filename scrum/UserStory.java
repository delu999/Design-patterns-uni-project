package scrum;

public class UserStory extends ScrumItem {

	private int storyPoints;

	public UserStory(String title, String description, int storyPoints) {
		super(title, description);
		this.storyPoints = storyPoints;
	}

	@Override
	public int getStoryPoints() {
		return storyPoints;
	}

	@Override
	public void accept(ScrumVisitor visitor) {
		visitor.visitUserStory(this);
	}

}