Если ты посмотришь на свой проект TODO List, то в нем будет примерно такой код.

@Override
public Collection<User> values() {
    final Session session = factory.openSession();
    final Transaction tx = session.beginTransaction();
    try {
        var rsl = session.createQuery("from User").list();
        tx.commit();
        return rsl;
    } catch (final Exception e) {
        session.getTransaction().rollback();
        throw e;
    } finally {
        session.close();
    }
}

или
public List<User> findByRoleName(final String roleName) {
    final Session session = factory.openSession();
    final Transaction tx = session.beginTransaction();
    try {
        final Query query = session.createQuery("from User as user inner join user.role as role on role.name=:name");
        query.setString("name", roleName);
        var rsl = query.list();
        tx.commit();
        return rsl;
    } catch (final Exception e) {
        session.getTransaction().rollback();
        throw e;
    } finally {
        session.close();
    }
}

Как мы видим все отличие только в try.

Здесь мы можем применить шаблон проектирования wrapper.

Создадим метод.

import java.util.function.Function;

private <T> T tx(final Function<Session, T> command) {
    final Session session = factory.openSession();
    final Transaction tx = session.beginTransaction();
    try {
        T rsl = command.apply(session);
        tx.commit();
        return rsl;
    } catch (final Exception e) {
        session.getTransaction().rollback();
        throw e;
    } finally {
        session.close();
    }
}

И теперь перепишем наши методы.

public Collection<User> values() {
    return this.tx(
            session -> session.createQuery("from User").list()
    );
}

и

public List<User> findByRoleName(final String roleName) {
    return this.tx(
            session -> {
                final Query query = session.createQuery("from User as user inner join user.role as role on role.name=:name");
                query.setString("name", roleName);
                return query.list();
            }
    );
}

Задание.

1. упростите предыдущий проект (TODO List) с использованием шаблона wrapper.