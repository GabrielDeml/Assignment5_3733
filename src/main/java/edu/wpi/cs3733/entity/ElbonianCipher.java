package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	private String text;

	public ElbonianCipher() {
	}

	public void setText(String text) {
		this.text = elbonianCipherConversion(text);
	}

	public String getText() {
		return text;
	}

	@Override
	public void notify(Object object) {
		setText((String) object);
	}

	public String elbonianCipherConversion(String text) {
		String cutText = text;

		if (text.length() > 140) {
			cutText = text.substring(0, 140);
		}

		String s = "";
		for (int x = 0; x < cutText.length(); x++) {
			char c = Character.toLowerCase(cutText.charAt(x));
			if ((c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i' || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q' || c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z' || c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '!' || c == '?' || c == '.' || c == ',' || c == ' ')) {
				switch (c) {
					//Lowercase
					case 'a':
						s += "01";
						break;
					case 'b':
						s += "02";
						break;
					case 'c':
						s += "03";
						break;
					case 'd':
						s += "04";
						break;
					case 'e':
						s += "05";
						break;
					case 'f':
						s += "06";
						break;
					case 'g':
						s += "07";
						break;
					case 'h':
						s += "08";
						break;
					case 'i':
						s += "09";
						break;
					case 'j':
						s += "10";
						break;
					case 'k':
						s += "11";
						break;
					case 'l':
						s += "12";
						break;
					case 'm':
						s += "13";
						break;
					case 'n':
						s += "14";
						break;
					case 'o':
						s += "15";
						break;
					case 'p':
						s += "16";
						break;
					case 'q':
						s += "17";
						break;
					case 'r':
						s += "18";
						break;
					case 's':
						s += "19";
						break;
					case 't':
						s += "20";
						break;
					case 'u':
						s += "21";
						break;
					case 'v':
						s += "22";
						break;
					case 'w':
						s += "23";
						break;
					case 'x':
						s += "24";
						break;
					case 'y':
						s += "25";
						break;
					case 'z':
						s += "26";
						break;
					case '0':
						s += '_';
						break;
					case '1':
						s += 'a';
						break;
					case '2':
						s += 'b';
						break;
					case '3':
						s += 'c';
						break;
					case '4':
						s += 'd';
						break;
					case '5':
						s += 'e';
						break;
					case '6':
						s += 'f';
						break;
					case '7':
						s += 'g';
						break;
					case '8':
						s += 'h';
						break;
					case '9':
						s += 'i';
						break;
					case ' ':
						s += 'S';
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