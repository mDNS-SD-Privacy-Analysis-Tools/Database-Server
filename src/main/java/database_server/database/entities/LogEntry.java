package database_server.database.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by codewing on 28.11.2016.
 */
@Entity
@Table(name = "logs", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String origin;

    @NotNull
    private String domain;

    @NotNull
    private String service;

    @NotNull
    private String service_protocol;

    @NotNull
    private String instance;

    @NotNull
    private String time;

    @NotNull
    private String server;

    @NotNull
    private int port;

    @OneToMany
    private Set<TxtData> txtDataList = new HashSet<>();;

    public LogEntry() {}

    public long getId() {
        return id;
    }

    public String getDomain() {
        return domain;
    }

    public String getService() {
        return service;
    }

    public String getInstance() {
        return instance;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getTime() {
        return time;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getService_protocol() {
        return service_protocol;
    }

    public void setService_protocol(String service_protocol) {
        this.service_protocol = service_protocol;
    }

    public Set<TxtData> getTxtDataList() {
        return txtDataList;
    }

    public void setTxtDataList(Set<TxtData> txtDataList) {
        this.txtDataList = txtDataList;
    }
}
