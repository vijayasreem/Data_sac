package com.Data.sacdata.service;

import java.util.List;

import com.Data.sacdata.model.Branch;
import com.Data.sacdata.repository.BranchRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    public Branch getBranchByWholesaler(String wholesaler, String wholesalerSpecificBranch) {
        return branchRepository.getBranchByWholesaler(wholesaler, wholesalerSpecificBranch);
    }

    public Branch getBranchByPeriodCompliance(int periodComplianceNumber, int periodCompliancePercentage) {
        return branchRepository.getBranchByPeriodCompliance(periodComplianceNumber, periodCompliancePercentage);
    }

    public Branch getBranchByPublicationCompliance(int publicationComplianceNumberSecondDelivery, int publicationComplianceNumberRetailersSecondDelivery, int publicationComplianceNumberCopiesRetailersSecondDelivery) {
        return branchRepository.getBranchByPublicationCompliance(publicationComplianceNumberSecondDelivery, publicationComplianceNumberRetailersSecondDelivery, publicationComplianceNumberCopiesRetailersSecondDelivery);
    }

    public Branch getBranchByRdtSdtCompliance(int rdtSdtWeightedCompliancePercentage, int rdtSdtWeightedCompliancePercentageBreakdown, int publisherEfficiencyPercentageScore) {
        return branchRepository.getBranchByRdtSdtCompliance(rdtSdtWeightedCompliancePercentage, rdtSdtWeightedCompliancePercentageBreakdown, publisherEfficiencyPercentageScore);
    }

    public Branch getBranchByComment(String comment) {
        return branchRepository.getBranchByComment(comment);
    }

}