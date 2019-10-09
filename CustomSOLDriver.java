
/**
 *
 * A class to test the CustomSOL class
 *
 *
 * @author YOUR NAME HERE
 *
 */

public class CustomSOLDriver {



	public static void main(String[] args) {

		CustomSOL<String> list = new CustomSOL<String>();

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
        //TEST 3: Adding 7 to the list and do prettyString
        list.solAdd("7");
        System.out.print("TEST 3: Adding 7, PrettyStr() on an 7 sized list. Expected: {1,2,3,4,5,6,7}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 4: LookUp an Item in the list
        System.out.print("TEST 4: solLookup() item 1. Expected: 1. Actual: ");
        //System.out.println(list.solLookup("1"));
        //TEST 5: PrettyStr on an  directory
        System.out.print("TEST 2: PrettyStr() on an 7 sized list. Expected: {1,2,3,4,5,6,7}. Actual: ");
        System.out.println(list.prettyStr());
        //TEST 6: LookUp an Item in the list
        System.out.print("TEST 4: solLookup() item 7. Expected: 7. Actual: ");
        System.out.println(list.solLookup("7"));
        //TEST 7: PrettyStr on an  directory
        System.out.print("TEST 2: PrettyStr() on an 7 sized list. Expected: {1,2,3,4,5,7,6}. Actual: ");
        System.out.println(list.prettyStr());
	}

}
