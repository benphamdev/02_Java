package bt2Nov25;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee implements IManageable {
	private List<IWorkable> teamMembers;

	public Manager(String name) {
		super(name);
		teamMembers = new ArrayList<IWorkable>();
	}

	@Override
	public void manage() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " is managing the team ");
		for (IWorkable member : teamMembers) {
			member.performDuties();
		}
	}

	public void addTeamMember(IWorkable member) {
		teamMembers.add(member);
	}
}
