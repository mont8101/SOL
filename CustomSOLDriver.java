
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
        System.out.print("TEST 2: PrettyStr() on an 6 sized list. Expected: {1 2 3 4 5 6 }. Actual: ");
        System.out.println(list.prettyStr());




	}

}
