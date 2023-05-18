package com.Data.sacdata.controller;

import java.util.List;

import com.Data.sacdata.model.Branch;
import com.Data.sacdata.service.BranchService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/branches")
    public List<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }

    @GetMapping("/branch/wholesaler")
    public Branch getBranchByWholesaler(@RequestParam String wholesaler, @RequestParam String wholesalerSpecificBranch) {
        return branchService.getBranchByWholesaler(wholesaler, wholesalerSpecificBranch);
    }

    @GetMapping("/branch/period")
    public Branch getBranchByPeriodCompliance(@RequestParam int periodComplianceNumber, @RequestParam int periodCompliancePercentage) {
        return branchService.getBranchByPeriodCompliance(periodComplianceNumber, periodCompliancePercentage);
    }

    @GetMapping("/branch/publication")
    public Branch getBranchByPublicationCompliance(@RequestParam int publicationComplianceNumberSecondDelivery, @RequestParam int publicationComplianceNumberRetailersSecondDelivery,
            @RequestParam int publicationComplianceNumberCopiesRetailersSecondDelivery) {
        return branchService.getBranchByPublicationCompliance(publicationComplianceNumberSecondDelivery, publicationComplianceNumberRetailersSecondDelivery,
                publicationComplianceNumberCopiesRetailersSecondDelivery);
    }

    @GetMapping("/branch/rdtsdt")
    public Branch getBranchByRdtSdtCompliance(@RequestParam int rdtSdtWeightedCompliancePercentage, @RequestParam int rdtSdtWeightedCompliancePercentageBreakdown,
            @RequestParam int publisherEfficiencyPercentageScore) {
        return branchService.getBranchByRdtSdtCompliance(rdtSdtWeightedCompliancePercentage, rdtSdtWeightedCompliancePercentageBreakdown,
                publisherEfficiencyPercentageScore);
    }

    @GetMapping("/branch/comment")
    public Branch getBranchByComment(@RequestParam String comment) {
        return branchService.getBranchByComment(comment);
    }

}