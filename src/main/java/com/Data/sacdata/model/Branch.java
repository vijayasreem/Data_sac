package com.Data.sacdata.model;

import javax.persistence.*;

@Entity
@Table(name = "branch")
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wholesaler")
    private String wholesaler;

    @Column(name = "wholesaler_specific_branch")
    private String wholesalerSpecificBranch;

    @Column(name = "period_compliance_number")
    private int periodComplianceNumber;

    @Column(name = "period_compliance_percentage")
    private int periodCompliancePercentage;

    @Column(name = "publication_compliance_number_second_delivery")
    private int publicationComplianceNumberSecondDelivery;

    @Column(name = "publication_compliance_number_retailers_second_delivery")
    private int publicationComplianceNumberRetailersSecondDelivery;

    @Column(name = "publication_compliance_number_copies_retailers_second_delivery")
    private int publicationComplianceNumberCopiesRetailersSecondDelivery;

    @Column(name = "rdt_sdt_weighted_compliance_percentage")
    private int rdtSdtWeightedCompliancePercentage;

    @Column(name = "rdt_sdt_weighted_compliance_percentage_breakdown")
    private int rdtSdtWeightedCompliancePercentageBreakdown;

    @Column(name = "publisher_efficiency_percentage_score")
    private int publisherEfficiencyPercentageScore;

    @Column(name = "comment")
    private String comment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWholesaler() {
        return wholesaler;
    }

    public void setWholesaler(String wholesaler) {
        this.wholesaler = wholesaler;
    }

    public String getWholesalerSpecificBranch() {
        return wholesalerSpecificBranch;
    }

    public void setWholesalerSpecificBranch(String wholesalerSpecificBranch) {
        this.wholesalerSpecificBranch = wholesalerSpecificBranch;
    }

    public int getPeriodComplianceNumber() {
        return periodComplianceNumber;
    }

    public void setPeriodComplianceNumber(int periodComplianceNumber) {
        this.periodComplianceNumber = periodComplianceNumber;
    }

    public int getPeriodCompliancePercentage() {
        return periodCompliancePercentage;
    }

    public void setPeriodCompliancePercentage(int periodCompliancePercentage) {
        this.periodCompliancePercentage = periodCompliancePercentage;
    }

    public int getPublicationComplianceNumberSecondDelivery() {
        return publicationComplianceNumberSecondDelivery;
    }

    public void setPublicationComplianceNumberSecondDelivery(int publicationComplianceNumberSecondDelivery) {
        this.publicationComplianceNumberSecondDelivery = publicationComplianceNumberSecondDelivery;
    }

    public int getPublicationComplianceNumberRetailersSecondDelivery() {
        return publicationComplianceNumberRetailersSecondDelivery;
    }

    public void setPublicationComplianceNumberRetailersSecondDelivery(int publicationComplianceNumberRetailersSecondDelivery) {
        this.publicationComplianceNumberRetailersSecondDelivery = publicationComplianceNumberRetailersSecondDelivery;
    }

    public int getPublicationComplianceNumberCopiesRetailersSecondDelivery() {
        return publicationComplianceNumberCopiesRetailersSecondDelivery;
    }

    public void setPublicationComplianceNumberCopiesRetailersSecondDelivery(int publicationComplianceNumberCopiesRetailersSecondDelivery) {
        this.publicationComplianceNumberCopiesRetailersSecondDelivery = publicationComplianceNumberCopiesRetailersSecondDelivery;
    }

    public int getRdtSdtWeightedCompliancePercentage() {
        return rdtSdtWeightedCompliancePercentage;
    }

    public void setRdtSdtWeightedCompliancePercentage(int rdtSdtWeightedCompliancePercentage) {
        this.rdtSdtWeightedCompliancePercentage = rdtSdtWeightedCompliancePercentage;
    }

