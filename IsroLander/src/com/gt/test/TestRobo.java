package com.gt.test;

import com.gt.beans.Robot;

public class TestRobo {

	public static void main(String[] args) {
			Robot robot = new Robot(null, null, null);
			robot.setId("524hjw");
			robot.setName("Virat");
			robot.setChip("42core");
			System.out.println(robot);
	}

}
