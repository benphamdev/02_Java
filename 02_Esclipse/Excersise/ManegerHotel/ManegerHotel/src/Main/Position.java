package Main;

public class Position {
	private String positionId; // PK
	private String namePostion;

	public Position(String positionId, String namePostion) {
		this.positionId = positionId;
		this.namePostion = namePostion;
	}

	public String getpositionId() {
		return positionId;
	}

	public void setpositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getName() {
		return namePostion;
	}

	public void setName(String namePostion) {
		this.namePostion = namePostion;
	}
}
