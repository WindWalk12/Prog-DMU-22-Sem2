package Exercise4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
		List<Runner> runners = new ArrayList<>();
		runners.addAll(List.of(
				new Runner("Ib", 30),
				new Runner("Per", 50),
				new Runner("Ole", 27),
				new Runner("Ulla", 40),
				new Runner("Jens", 35),
				new Runner("Hans", 28)));
		System.out.println(runners);
		System.out.println();

		// OBS: Throws exception.
		/*
		Iterator<Runner> iterator = runners.listIterator();
		while (iterator.hasNext()) {
			if (iterator.next().getLapTime() >= 40) {
				iterator.remove();
			}
		}
		 */
		//removeIf(runners, r -> r.getLapTime() >= 40);
		runners.removeIf(r -> r.getLapTime() >= 40);
		System.out.println(runners);
		System.out.println();

	}

	/**
	 * Removes runners that satisfies the given filter.
	 * Returns true, if any runner is removed.
	 */
	public static boolean removeIf(List<Runner> runners, Predicate<Runner> filter) {
		boolean removed = false;
		Iterator<Runner> iterator = runners.listIterator();
		while (iterator.hasNext()) {
			if (filter.test(iterator.next())) {
				iterator.remove();
				removed = true;
			}
		}
		return removed;
	}
}