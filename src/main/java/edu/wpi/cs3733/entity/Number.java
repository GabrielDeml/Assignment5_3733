package edu.wpi.cs3733.entity;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Number {
    private PropertyChangeSupport support = new PropertyChangeSupport(this);
    private String state;

    public void addListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void setState(String newState) {
        this.support.firePropertyChange("state", this.state, newState);
        this.state = newState;
    }

}
