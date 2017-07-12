package com.nucleussoftware.p2p.domain.domainListener;

import com.nucleussoftware.p2p.domain.AbstractDomains.BaseAbstractDomain;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

public class AuditingListeners {

    @PrePersist
    protected void beforePersist(BaseAbstractDomain abstractDomain) {
        abstractDomain.setDateCreated(new Date());
        abstractDomain.setLastUpdated(new Date());
    }

    @PreUpdate
    protected void beforeUpdate(BaseAbstractDomain abstractDomain) {
        abstractDomain.setLastUpdated(new Date());
    }
}
