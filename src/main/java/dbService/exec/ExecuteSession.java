package dbService.exec;

import org.hibernate.SessionFactory;

public class ExecuteSession {

    private final SessionFactory sessionFactory;

    public ExecuteSession(SessionFactory sessionFactory) {
        this.sessionFactory =sessionFactory;
    }



}
