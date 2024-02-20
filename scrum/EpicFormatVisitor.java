package scrum;

import java.util.Iterator;

public class EpicFormatVisitor implements ScrumVisitor {
	
    private StringBuilder formattedString = new StringBuilder();
    private EpicFormatStrategy strategy;
    private int indentLevel = 0;

    public EpicFormatVisitor(EpicFormatStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void visitUserStory(UserStory userStory) {
        // This visitor only counts epics
    }

    @Override
    public void visitEpic(Epic epic) {
        formattedString.append(strategy.formatEpic(epic, indentLevel)); 
        
        indentLevel++;
        Iterator<ScrumItem> iterator = epic.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(this);
        }
        indentLevel--;
    }

    public String getFormattedString() {
        return formattedString.toString();
    }
}