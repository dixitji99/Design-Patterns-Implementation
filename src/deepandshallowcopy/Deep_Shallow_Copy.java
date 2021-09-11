package deepandshallowcopy;

import java.util.*;

class Deep {

	private int[] data;

	// altered to make a deep copy of values
	public Deep(int[] values) {
		data = new int[values.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = values[i];
		}
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}

class Shallow {

	private int[] data;

	// makes a shallow copy of values
	public Shallow(int[] values) {
		data = values;
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}

public class Deep_Shallow_Copy {

	public static void main(String[] args) {
		int[] vals = { 3, 7, 9 };
		Shallow e = new Shallow(vals);
		e.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		e.showData(); // prints out [13, 7, 9]

		// Very confusing, because we didn't
		// intentionally change anything about
		// the object e refers to.

		vals[0] = 3;
		Deep e2 = new Deep(vals);
		e2.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		e2.showData(); // prints out [3, 7, 9]

		// changes in array values will not be
		// shown in data values.

	}

}
