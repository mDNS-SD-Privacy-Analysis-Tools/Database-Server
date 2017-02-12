package database_server.database.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by codewing on 10.01.2017.
 */

@Entity
@Table(name = "txtentry", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class TxtData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @JsonIgnore
    @ManyToOne
    private LogEntry logEntry;

    @NotNull
    private String name, content;

    public TxtData(){}

    public TxtData(String content, String name){
        this.content = content;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
