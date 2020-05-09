package edu.wpi.cs3733.entity;

import javafx.scene.control.TextArea;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ElbonianCipherObserver implements PropertyChangeListener {
    private String state;
    private TextArea CipherTextArea;

    public ElbonianCipherObserver(TextArea cipherText) {
        this.CipherTextArea = cipherText;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        String newState =(String) propertyChangeEvent.getNewValue();
        this.setState(newState);
        ElbonianCipher elbonianCipher= new ElbonianCipher();
        elbonianCipher.setText(newState);
        CipherTextArea.setText(elbonianCipher.getText());
    }
}
