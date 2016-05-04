import java.util.List;
import java.util.LinkedList;

public class GeneralHashMap extends MyHashMap {

	public GeneralHashMap() {

	}

	@Override
	protected int hash(String token) {
		String standIn = token.toLowerCase();
		int base = 0;
        for (int i = 0; i < token.length(); i ++){
            switch(standIn.charAt(i)){

                case 'e': base += 2 * i;
                    break;
                case 't': base += 3 * i;
                    break;
                case 'a': base += 5 * i;
                    break;
                case 'o': base += 7 * i;
                    break;
                case 'i': base += 11 * i;
                    break;
                case 'n': base += 13 * i;
                    break;
                case 's': base += 17 * i;
                    break;
                case 'r': base += 19 * i;
                    break;
                case 'h': base += 23 * i;
                    break;
                case 'd': base += 29 * i;
                    break;
                case 'l': base += 31 * i;
                    break;
                case 'u': base += 37 * i;
                    break;
                case 'c': base += 41 * i;
                    break;
                case 'm': base += 43 * i;
                    break;
                case 'f': base += 47 * i;
                    break;
                case 'y': base += 53 * i;
                    break;
                case 'w': base += 59 * i;
                    break;
                case 'g': base += 61 * i;
                    break;
                case 'p': base += 67 * i;
                    break;
                case 'b': base += 71 * i;
                    break;
                case 'v': base += 73 * i;
                    break;
                case 'k': base += 79 * i;
                    break;
                case 'x': base += 83 * i;
                    break;
                case 'q': base += 89 * i;
                    break;
                case 'j': base += 97 * i;
                    break;
                case 'z': base += 101 * i;
                    break;

            }
        }
		return -1;
		
	}

	@Override
	public void add(String token) {
		
		// TODO: IMPLEMENT ADD METHOD USING BUCKETS
	
	}

	@Override
	public void display() {
		
		// TODO: IMPLEMENT DISPLAY METHOD TO SHOW CONTENTS OF ALL BUCKETS
		
	}

}
