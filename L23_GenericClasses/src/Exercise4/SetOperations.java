package Exercise4;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
		Set<T> set = new HashSet<>(s1);
		set.addAll(s2);
		return set;
	}

	public static <T> Set<T> differens(Set<T> s1, Set<T> s2) {
		Set<T> set = new HashSet<>(s1);
		set.removeAll(s2);
		return set;

	}

	public static <T> Set<T> intesection(Set<T> s1, Set<T> s2) {
		Set<T> set = new HashSet<>(s1);
		set.retainAll(s2);
		return set;

	}

}
