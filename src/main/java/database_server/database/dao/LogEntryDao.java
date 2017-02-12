package database_server.database.dao;

import database_server.database.entities.LogEntry;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by codewing on 02.12.2016.
 */

@Transactional
public interface LogEntryDao extends CrudRepository<LogEntry, Long> {
    List<LogEntry> findByInstance(String instance);

    List<LogEntry> findByService(String service);

    List<LogEntry> findByDomain(String domain);

    List<LogEntry> findByOrigin(String origin);
}
