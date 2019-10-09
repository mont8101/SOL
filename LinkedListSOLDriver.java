
/**
 *
 * A class to test the LinkedListSOLDriver
 *
 * @author Luca Comba
 *
 */

public class LinkedListSOLDriver {


	public static void main(String[] args) {

		LinkedListSOL<String> list = new LinkedListSOL<String>();
		LinkedListSOL<Integer> emptyList = new LinkedListSOL<Integer>();
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
        System.out.print("TEST 2: PrettyStr() on an 6 sized list. Expected: {1,2,3,4,5,6}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 3: Look up an item in the list 
        System.out.print("TEST 3: solLookup() item 3. Expected: 3. Actual: ");
        System.out.println(list.solLookup("3"));
        //TEST 4: PrettyStr on the list where 3 was pushed
        System.out.print("TEST 4: PrettyStr of the list. Expected: {1,3,2,4,5,6}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 5: Look up an item in the list 
        System.out.print("TEST 5: solLookup() item 3. Expected: 3. Actual: ");
        System.out.println(list.solLookup("3"));
        //TEST 6: PrettyStr on the list where 3 was pushed
        System.out.print("TEST 6: PrettyStr of the list. Expected: {3,1,2,4,5,6}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 7: Look up an item in the list 
        System.out.print("TEST 7: solLookup() item 3. Expected: 3. Actual: ");
        System.out.println(list.solLookup("3"));
        //TEST 8: PrettyStr on the list where 3 was not pushed
        System.out.print("TEST 8: PrettyStr of the list. Expected: {3,1,2,4,5,6}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 9: Look up an item in the list 
        System.out.print("TEST 9: solLookup() item 6. Expected: 6. Actual: ");
        System.out.println(list.solLookup("6"));
        //TEST 10: PrettyStr on the list where 6 was pushed
        System.out.print("TEST 10: PrettyStr of the list. Expected: {3,1,2,4,6,5}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 11: Look up an item in the list 
        System.out.print("TEST 11: solLookup() item 7. Expected: null. Actual: ");
        System.out.println(list.solLookup("7"));
        //TEST 12: PrettyStr on the list where 3 was pushed
        System.out.print("TEST 12: PrettyStr of the list. Expected: {3,1,2,4,6,5}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 13: Look up in a empty list
        System.out.print("TEST 13: solLookup() on the emptyList item 7. Expected: null. Actual: ");
        System.out.println(emptyList.solLookup(7));
        //TEST 14: Creating a list of integers adding 100 , 90 , 80. Then look up 90.
        LinkedListSOL<Integer> intList = new LinkedListSOL<Integer>();
        intList.solAdd(100);
        intList.solAdd(90);
        intList.solAdd(80);
        System.out.print("TEST 14: solLookup() on the Integer item 90. Expected: 90. Actual: ");
        System.out.println(intList.solLookup(90));
        System.out.print("TEST 14: PrettyStr of the IntegerList list. Expected: {90,100,80}. Actual: ");
        System.out.println(intList.prettyStr());
	}

}
