package genericExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericWildcard {

	public static void main(String[] args) {
		Collection<?> coll = new ArrayList<String>();
		List<? extends Number> list = new ArrayList<Long>();
	}
}
