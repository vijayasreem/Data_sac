·       User should able to view data from view data menu in both ways one is from view header option and another from some of the Drill down options.·       As a user I should able to view all four distinct areas report that includes RDT/SDT compliance, Period compliance, Publication Compliance and comments.·       As a user I should able to select date for any specific period or else it will take default as current date to show data.·       As a user I should able to see data by the selected Drill down day type function option.·       As a user I should able to see data by the selected Drill down date range in user came from.·       As a user I should able to select drop-down menu wholesaler if wholesales has more than one branch.·       As a user I should also select the drop-down menu for wholesaler-specific branch that user wish to view.·       As a user when I click on the weighted compliance percentage option then it will show explanations of how these data figures are calculated.·       As a user when I click on the publisher efficiency percentage option then it will show explanations of how these data figures are calculated.·       As a user I should allow downloading data in excel format by clicking more options where I get option to download it·       As a user by clicking on the reset button the selected data in the fields will get clear.

package com.Data.sacdata.repository;

import com.Data.sacdata.model.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepository extends JpaRepository<Branch, Long> {

    @Query("SELECT b FROM Branch b WHERE b.wholesaler = ?1 AND b.wholesalerSpecificBranch = ?2")
    Branch getBranchByWholesaler(String wholesaler, String wholesalerSpecificBranch);

    @Query("SELECT b FROM Branch b WHERE b.periodComplianceNumber = ?1 AND b.periodCompliancePercentage = ?2")
    Branch getBranchByPeriodCompliance(int periodComplianceNumber, int periodCompliancePercentage);

    @Query("SELECT b FROM Branch b WHERE b.publicationComplianceNumberSecondDelivery = ?1 AND b.publicationComplianceNumberRetailersSecondDelivery = ?2 AND b.publicationComplianceNumberCopiesRetailersSecondDelivery = ?3")
    Branch getBranchByPublicationCompliance(int publicationComplianceNumberSecondDelivery, int publicationComplianceNumberRetailersSecondDelivery, int publicationComplianceNumberCopiesRetailersSecondDelivery);

    @Query("SELECT b FROM Branch b WHERE b.rdtSdtWeightedCompliancePercentage = ?1 AND b.rdtSdtWeightedCompliancePercentageBreakdown = ?2 AND b.publisherEfficiencyPercentageScore = ?3")
    Branch getBranchByRdtSdtCompliance(int rdtSdtWeightedCompliancePercentage, int rdtSdtWeightedCompliancePercentageBreakdown, int publisherEfficiencyPercentageScore);
    
    @Query("SELECT b FROM Branch b WHERE b.comment = ?1")
    Branch getBranchByComment(String comment);

}