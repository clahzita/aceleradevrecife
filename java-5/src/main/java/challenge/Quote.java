package challenge;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "scripts")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String actor;

    @Column(name = "detail")
    private String quote;

/*
    private Integer episode;
    private String episode_name;
    private String segment;
    private String type;
    private String character;
    private LocalDate record_date;
    private String series;
    private LocalDate transmission_date;
*/

    protected Quote() {
    }

    public Quote(String actor, String quote) {
        this.actor = actor;
        this.quote = quote;
    }

    public Quote(Integer id, String actor, String quote) {
        this.id = id;
        this.actor = actor;
        this.quote = quote;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActor() {
        return this.actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;

    }

}
