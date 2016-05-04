import java.util.ArrayList;
import java.util.LinkedList;

public class GeneralHashMap extends MyHashMap {



	public GeneralHashMap() {
		LinkedList<String>[] buckets = new LinkedList[131];
		for (int i = 0; i < 131; i++)

		{
			buckets[i] = new LinkedList<String>();
		}
		// TODO: IMPLEMENT CONSTRUCTOR

	}

	@Override
	protected int hash(String token) {
		
		// TODO: IMPLEMENT HASHING FUNCTION FOR GENERAL HASHMAP
		return -1;
		
	}

	@Override
	public void add(String token) {
		// TODO: IMPLEMENT ADD METHOD USING BUCKETS
		int index = hash(token);
		buckets[index].add(token);
	
	}

	@Override
	public void display() {
		for(int i = 0; i<buckets.length;i++){
			System.out.println("bucket index " + i);
			for(int j = 0; j<buckets[i].size(); j++){
				System.out.print(buckets[i].get(j));
			}
		}
		
		// TODO: IMPLEMENT DISPLAY METHOD TO SHOW CONTENTS OF ALL BUCKETS
		
	}

}
