/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.pkg360;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "company", schema = "cit_353", catalog = "")
public class CompanyEntity {
    private int idCompany;
    private String companyName;

    @Id
    @Column(name = "idCompany")
    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    @Basic
    @Column(name = "CompanyName")
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyEntity that = (CompanyEntity) o;
        return idCompany == that.idCompany &&
                Objects.equals(companyName, that.companyName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(idCompany, companyName);
    }
}
