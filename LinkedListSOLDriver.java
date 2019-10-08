
/**
 *
 * A class to test the LinkedListSOLDriver
 *
 * @author YOUR NAME HERE
 *
 */

public class LinkedListSOLDriver {


	public static void main(String[] args) {

		LinkedListSOL<String> list = new LinkedListSOL<String>();
		//TEST 1: PrettyStr on an empty directory
		System.out.print("TEST 1: PrettyStr() on an empty Directory. Expected: {}. Actual: ");
		System.out.println(list.prettyStr());
		
		// Adding items to list
		list.solAdd("1");
		list.solAdd("2");
		list.solAdd("3");
        list.solAdd("4");
        list.solAdd("5");
        list.solAdd("6");
		
		//TEST 2: PrettyStr on an  directory
        System.out.print("TEST 2: PrettyStr() on an 6 sized list. Expected: {1 2 3 4 5 6 }. Actual: ");
        System.out.println(list.prettyStr());
        
        //TEST 3: Look up an item in the list 
        System.out.print("TEST 3: solLookup() item 3. Expected: 3. Actual: ");
        System.out.println(list.solLookup("3"));
        //TEST 4: PrettyStr on the list where 3 was pushed
        System.out.print("TEST 4: PrettyStr of the list. Expected: {1 3 2 4 5 6 }. Actual: ");
        System.out.println(list.prettyStr());
	}

}
