package com.example.SubmitForm;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
    @Id
    public int cid;
    public String cemail;
    public String cname;



    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }



    public int getCid() {
        return cid;
    }

    public String getCname() {
        return cname;
    }

    public String getCemail() {
        return cemail;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "cid=" + cid +
                ", cemail='" + cemail + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

}
