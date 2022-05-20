package _03FocusArea._08ComparableInterface;

/**
 * Created by Gra_m on 2022 05 20
 */

public class User implements Comparable<User>{
	private Integer points;

	public User(Integer points) {
		this.points = points;
	}
	@Override
	public int compareTo(User other) {
		return points - other.points;
	}

}
