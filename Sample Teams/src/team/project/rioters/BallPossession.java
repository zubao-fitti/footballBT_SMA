package team.project.rioters;

import behavior_tree.BTNode;
import behavior_tree.BTStatus;

public class BallPossession extends BTNode<CommandPlayer>{

	@Override
	public BTStatus tick(CommandPlayer agent) {
		if (agent.isPointsAreClose(agent.getPosition(), agent.getBallPos(), 1.0d))
			return BTStatus.SUCCESS;
		return BTStatus.FAILURE;
	}

}
