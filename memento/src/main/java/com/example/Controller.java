package com.example;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // Memento history
    private List <IMemento> redo;
    private List <IMemento> logs;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redo = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        saveToLogs();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        saveToLogs();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("Memento found in history");
            saveToRedo();
            saveToLogs();
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redo.isEmpty()) {
            System.out.println("Memento found in redo");
            saveToHistory();
            saveToLogs();
            IMemento nextState = redo.remove(redo.size() - 1);
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    public void restoreState(IMemento memento) {
        model.restoreState(memento);
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        history.add(currentState);
    }
    private void saveToRedo() {
        IMemento currentState = model.createMemento();
        redo.add(currentState);
    }
    public void saveToLogs() {
        IMemento currentState = model.createMemento();
        logs.add(currentState);
    }
    public List getHistoryStates() {
        return logs;
    }
}