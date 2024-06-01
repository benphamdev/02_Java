package Main;

public class Position {
	private String positionId; // PK
	private String namePostion;

	public Position(String id, String name) {
		this.positionId = id;
		this.namePostion = name;
	}

	public String getpositionId() {
		return positionId;
	}

	public void setpositionId(String id) {
		this.positionId = id;
	}

	public String getName() {
		return namePostion;
	}

	public void setName(String name) {
		this.namePostion = name;
	}
}
