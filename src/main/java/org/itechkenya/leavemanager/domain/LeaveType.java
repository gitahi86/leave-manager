/**
 * LeaveManager, a basic leave management program for small organizations
 * 
 * This file is part of LeaveManager.
 * 
 * LeaveManager is free software: you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * LeaveManager is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * 
 * See the GNU General Public License for more details. You should have received a copy of the GNU
 * General Public License along with LeaveManager. If not, see <http://www.gnu.org/licenses/>.
 */

package org.itechkenya.leavemanager.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author gitahi
 */
@Entity
@Table(name = "leave_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LeaveType.findAll", query = "SELECT l FROM LeaveType l ORDER BY l.name ASC"),
    @NamedQuery(name = "LeaveType.findById", query = "SELECT l FROM LeaveType l WHERE l.id = :id ORDER BY l.name ASC"),
    @NamedQuery(name = "LeaveType.findByName", query = "SELECT l FROM LeaveType l WHERE l.name = :name ORDER BY l.name ASC"),
    @NamedQuery(name = "LeaveType.findByDaysPerMonth", query = "SELECT l FROM LeaveType l WHERE l.daysPerMonth > :daysPerMonth ORDER BY l.name ASC"),
    @NamedQuery(name = "LeaveType.findByRegular", query = "SELECT l FROM LeaveType l WHERE l.regular = :regular ORDER BY l.name ASC"),
    @NamedQuery(name = "LeaveType.findByAbsolute", query = "SELECT l FROM LeaveType l WHERE l.absolute = :absolute ORDER BY l.name ASC"),
    @NamedQuery(name = "LeaveType.findByActive", query = "SELECT l FROM LeaveType l WHERE l.active = :active ORDER BY l.name ASC")})
public class LeaveType implements Serializable, Comparable<LeaveType> {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "days_per_month")
    private BigDecimal daysPerMonth;
    @Basic(optional = false)
    @Column(name = "regular")
    private boolean regular;
    @Basic(optional = false)
    @Column(name = "absolute")
    private boolean absolute;
    @Basic(optional = false)
    @Column(name = "active")
    private boolean active;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leaveType")
    private List<LeaveEvent> leaveEventList;

    public LeaveType() {
    }

    public LeaveType(Integer id) {
        this.id = id;
    }

    public LeaveType(Integer id, String name, BigDecimal daysPerMonth, boolean regular, boolean absolute, boolean active) {
        this.id = id;
        this.name = name;
        this.daysPerMonth = daysPerMonth;
        this.regular = regular;
        this.absolute = absolute;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getDaysPerMonth() {
        return daysPerMonth;
    }

    public void setDaysPerMonth(BigDecimal daysPerMonth) {
        this.daysPerMonth = daysPerMonth;
    }

    public boolean getRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

    public boolean getAbsolute() {
        return absolute;
    }

    public void setAbsolute(boolean absolute) {
        this.absolute = absolute;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @XmlTransient
    public List<LeaveEvent> getLeaveEventList() {
        return leaveEventList;
    }

    public void setLeaveEventList(List<LeaveEvent> leaveEventList) {
        this.leaveEventList = leaveEventList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LeaveType)) {
            return false;
        }
        LeaveType other = (LeaveType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(LeaveType that) {
        return this.name.compareTo(that.name);
    }
    
}
