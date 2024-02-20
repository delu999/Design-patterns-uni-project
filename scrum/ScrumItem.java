package scrum;

public abstract class ScrumItem {

	private String title;
	private String description;

	protected ScrumItem(String title, String description) {
		this.title = title;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public abstract int getStoryPoints();

	public abstract void accept(ScrumVisitor visitor);

}