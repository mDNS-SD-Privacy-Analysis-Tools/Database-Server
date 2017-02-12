package database_server.database.dao;

import database_server.database.entities.LogEntry;
import database_server.database.entities.TxtData;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by codewing on 02.12.2016.
 */

@Transactional
public interface TxtDataDao extends CrudRepository<TxtData, Long> {

}
