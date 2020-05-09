package edu.wpi.cs3733.entity;

import javafx.scene.control.TextArea;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CaesarCipherObserver implements PropertyChangeListener {
    private String state;
    private TextArea CipherTextArea;

    public CaesarCipherObserver(TextArea cipherText) {
        this.CipherTextArea = cipherText;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void propertyChange(PropertyChangeEvent propertyChangeEvent) {
        String newState =(String) propertyChangeEvent.getNewValue();
        this.setState(newState);
        CaesarCipher caesarCipher= new CaesarCipher();
        caesarCipher.setText(newState);
        CipherTextArea.setText(caesarCipher.getText());
    }
}
