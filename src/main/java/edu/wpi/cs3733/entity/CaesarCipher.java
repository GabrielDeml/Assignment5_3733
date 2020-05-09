package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

    private String text;

    public CaesarCipher() {

    }

    public void setText(String text) {
        this.text = caesarCipherConversion(text);
    }

    public String getText() {
        return text;
    }

    @Override
    public void notify(Object object) {
        setText((String) object);
    }

    public String caesarCipherConversion(String text) {
        if (text.isEmpty()) {
            return "";
        } else {

            if (text.length() > 140) {
                return "";
            } else {
                String s = "";
                for (int x = 0; x < text.length(); x++) {
                    char c = text.charAt(x);
                    if ((Character.toLowerCase(c) == 'a' || Character.toLowerCase(c) == 'b' || Character.toLowerCase(c) == 'c' || Character.toLowerCase(c) == 'd' || Character.toLowerCase(c) == 'e' || Character.toLowerCase(c) == 'f' || Character.toLowerCase(c) == 'g' || Character.toLowerCase(c) == 'h' || Character.toLowerCase(c) == 'i' || Character.toLowerCase(c) == 'j' || Character.toLowerCase(c) == 'k' || Character.toLowerCase(c) == 'l' || Character.toLowerCase(c) == 'm' || Character.toLowerCase(c) == 'n' || Character.toLowerCase(c) == 'o' || Character.toLowerCase(c) == 'p' || Character.toLowerCase(c) == 'q' || Character.toLowerCase(c) == 'r' || Character.toLowerCase(c) == 's' || Character.toLowerCase(c) == 't' || Character.toLowerCase(c) == 'u' || Character.toLowerCase(c) == 'v' || Character.toLowerCase(c) == 'w' || Character.toLowerCase(c) == 'x' || Character.toLowerCase(c) == 'y' || Character.toLowerCase(c) == 'z' || c == '!' || c == '?' || c == '.' || c == ',' || c == ' ')) {
                        switch (c) {
                            //Lowercase
                            case 'a':
                                s += 'z';
                                break;
                            case 'b':
                                s += 'y';
                                break;
                            case 'c':
                                s += 'x';
                                break;
                            case 'd':
                                s += 'w';
                                break;
                            case 'e':
                                s += 'v';
                                break;
                            case 'f':
                                s += 'u';
                                break;
                            case 'g':
                                s += 't';
                                break;
                            case 'h':
                                s += 's';
                                break;
                            case 'i':
                                s += 'r';
                                break;
                            case 'j':
                                s += 'q';
                                break;
                            case 'k':
                                s += 'p';
                                break;
                            case 'l':
                                s += 'o';
                                break;
                            case 'm':
                                s += 'n';
                                break;
                            case 'n':
                                s += 'm';
                                break;
                            case 'o':
                                s += 'l';
                                break;
                            case 'p':
                                s += 'k';
                                break;
                            case 'q':
                                s += 'j';
                                break;
                            case 'r':
                                s += 'i';
                                break;
                            case 's':
                                s += 'h';
                                break;
                            case 't':
                                s += 'g';
                                break;
                            case 'u':
                                s += 'f';
                                break;
                            case 'v':
                                s += 'e';
                                break;
                            case 'w':
                                s += 'd';
                                break;
                            case 'x':
                                s += 'c';
                                break;
                            case 'y':
                                s += 'b';
                                break;
                            case 'z':
                                s += 'a';
                                break;
                            //Uppercase
                            case 'A':
                                s += 'Z';
                                break;
                            case 'B':
                                s += 'Y';
                                break;
                            case 'C':
                                s += 'X';
                                break;
                            case 'D':
                                s += 'W';
                                break;
                            case 'E':
                                s += 'V';
                                break;
                            case 'F':
                                s += 'U';
                                break;
                            case 'G':
                                s += 'T';
                                break;
                            case 'H':
                                s += 'S';
                                break;
                            case 'I':
                                s += 'R';
                                break;
                            case 'J':
                                s += 'Q';
                                break;
                            case 'K':
                                s += 'P';
                                break;
                            case 'L':
                                s += 'O';
                                break;
                            case 'M':
                                s += 'N';
                                break;
                            case 'N':
                                s += 'M';
                                break;
                            case 'O':
                                s += 'L';
                                break;
                            case 'P':
                                s += 'K';
                                break;
                            case 'Q':
                                s += 'J';
                                break;
                            case 'R':
                                s += 'I';
                                break;
                            case 'S':
                                s += 'H';
                                break;
                            case 'T':
                                s += 'G';
                                break;
                            case 'U':
                                s += 'F';
                                break;
                            case 'V':
                                s += 'E';
                                break;
                            case 'W':
                                s += 'D';
                                break;
                            case 'X':
                                s += 'C';
                                break;
                            case 'Y':
                                s += 'B';
                                break;
                            case 'Z':
                                s += 'A';
                                break;
                            default:
                                s += c;
                                break;
                        }
                    } else {
                        return "";
                    }
                }
                return s;
            }
        }
    }
}