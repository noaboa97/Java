package data;

public class Factory {

	public static data.StudentDAO getDAO(data.Storage storage) {
		data.StudentDAO dao;
		switch (storage) {
		case XML:
			dao = new data.StudentDAOXML();
			break;

		case DB:
			dao = new data.StudentDAODB();
			break;

		default:
			dao = new data.StudentDAOMemory();
			break;
		}
		
		return dao;
	}
}
