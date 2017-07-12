package com.nucleussoftware.p2p.domain.AbstractDomains;

import com.nucleussoftware.p2p.domain.domainListener.AuditingListeners;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.StringJoiner;

@EntityListeners({AuditingListeners.class})
@MappedSuperclass
public class BaseAbstractDomain implements Serializable {

    @Temporal(value = TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "date_created", insertable = true, updatable = false, nullable = false)
    private Date dateCreated;

    @Temporal(value = TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "last_updated", insertable = true, updatable = true, nullable = false)
    private Date lastUpdated;

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("dateCreated = " + dateCreated)
                .add("lastUpdated = " + lastUpdated).toString();
    }


}
