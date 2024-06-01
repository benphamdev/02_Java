package bai4;

public class Team {
	private String id, name;
	private int numberOfMatch, point, goalDifference;

	public Team(String id, String name, int numberOfMatch, int point, int goalDifference) {
		this.id = id;
		this.name = name;
		this.numberOfMatch = numberOfMatch;
		this.point = point;
		this.goalDifference = goalDifference;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getGoalDifference() {
		return goalDifference;
	}

	public void setGoalDifference(int goalDifference) {
		this.goalDifference = goalDifference;
	}

}
