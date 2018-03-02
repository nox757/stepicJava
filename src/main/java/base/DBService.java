package base;

import dbService.DBException;
import dbService.dataSets.UsersProfileDataSet;

public interface DBService {

    public void printConnectInfo();
    public UsersProfileDataSet getUser(String login) throws DBException;
    public long addUser(String login, String pass, String email) throws DBException;
}
