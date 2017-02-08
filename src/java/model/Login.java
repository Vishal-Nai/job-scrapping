/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "Login")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Login.findAll", query = "SELECT l FROM Login l"),
    @NamedQuery(name = "Login.findByUid", query = "SELECT l FROM Login l WHERE l.uid = :uid"),
    @NamedQuery(name = "Login.findByUname", query = "SELECT l FROM Login l WHERE l.uname = :uname"),
    @NamedQuery(name = "Login.findByPwd", query = "SELECT l FROM Login l WHERE l.pwd = :pwd")})
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id@GeneratedValue
    @Basic(optional = false)
    @Column(name = "uid")
    private Integer uid;
    @Basic(optional = false)
    @Column(name = "uname")
    private String uname;
    @Basic(optional = false)
    @Column(name = "pwd")
    private String pwd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uid")
    private Collection<UserReg> userRegCollection;

    public Login() {
    }

    public Login(Integer uid) {
        this.uid = uid;
    }

    public Login(Integer uid, String uname, String pwd) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @XmlTransient
    public Collection<UserReg> getUserRegCollection() {
        return userRegCollection;
    }

    public void setUserRegCollection(Collection<UserReg> userRegCollection) {
        this.userRegCollection = userRegCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Login)) {
            return false;
        }
        Login other = (Login) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Login[ uid=" + uid + " ]";
    }
    
}
