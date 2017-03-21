/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Vishal
 */
@Entity
@Table(name = "UserReg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserReg.findAll", query = "SELECT u FROM UserReg u")
    , @NamedQuery(name = "UserReg.findByTid", query = "SELECT u FROM UserReg u WHERE u.tid = :tid")
    , @NamedQuery(name = "UserReg.findByEmail", query = "SELECT u FROM UserReg u WHERE u.email = :email")
    , @NamedQuery(name = "UserReg.findByMobile", query = "SELECT u FROM UserReg u WHERE u.mobile = :mobile")
    , @NamedQuery(name = "UserReg.findByState", query = "SELECT u FROM UserReg u WHERE u.state = :state")
    , @NamedQuery(name = "UserReg.findByCity", query = "SELECT u FROM UserReg u WHERE u.city = :city")})
public class UserReg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    @Basic(optional = false)
    @Column(name = "tid")
    private Integer tid;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "mobile")
    private String mobile;
    @Basic(optional = false)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @Column(name = "city")
    private String city;
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    @ManyToOne(optional = false)
    private Login uid;

    public UserReg() {
    }

    public UserReg(Integer tid) {
        this.tid = tid;
    }

    public UserReg(Integer tid, String email, String mobile, String state, String city) {
        this.tid = tid;
        this.email = email;
        this.mobile = mobile;
        this.state = state;
        this.city = city;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Login getUid() {
        return uid;
    }

    public void setUid(Login uid) {
        this.uid = uid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tid != null ? tid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserReg)) {
            return false;
        }
        UserReg other = (UserReg) object;
        if ((this.tid == null && other.tid != null) || (this.tid != null && !this.tid.equals(other.tid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.UserReg[ tid=" + tid + " ]";
    }
    
}
