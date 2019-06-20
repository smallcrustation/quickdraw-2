package com.krill.quickdraw2.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="project_name")
    private String projectName;

    @Column(name="project_address")
    private String projectAddress;

    @Column(name="original_contract_sum")
    private BigDecimal originalContractSum;

    @Column(name="contractor")
    private String contractor;

    public Project(){}

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectAddress='" + projectAddress + '\'' +
                ", originalContractSum=" + originalContractSum +
                ", contractor='" + contractor + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectAddress() {
        return projectAddress;
    }

    public void setProjectAddress(String projectAddress) {
        this.projectAddress = projectAddress;
    }

    public BigDecimal getOriginalContractSum() {
        return originalContractSum;
    }

    public void setOriginalContractSum(BigDecimal originalContractSum) {
        this.originalContractSum = originalContractSum;
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }
}

