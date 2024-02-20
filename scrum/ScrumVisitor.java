package scrum;

public interface ScrumVisitor {

	void visitUserStory(UserStory userStory);

	void visitEpic(Epic epic);

}
