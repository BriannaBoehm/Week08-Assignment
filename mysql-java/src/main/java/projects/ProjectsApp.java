package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {

		DbConnection.getConnection();//calls the .getConnection method from the DbConnection class 

	}

}
