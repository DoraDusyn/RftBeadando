package rftbackend.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorok")
public class Mentor {

    @Id
    @Column(name="ID")
    Long id;

    public Mentor(){

    }

    public Mentor(Long id){
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
