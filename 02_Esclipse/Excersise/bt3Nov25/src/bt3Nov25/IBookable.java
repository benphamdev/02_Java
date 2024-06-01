package bt3Nov25;

import java.util.Date;

public interface IBookable {
	boolean bookRoom(Date date);

	void releaseRoom(Date date);
}
