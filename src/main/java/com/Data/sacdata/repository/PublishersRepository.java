·       Ability to edit, view and download functionalities.·       Ability to download the data in .csv format.·       User should able to view the data in excel format.·       User should able to add/edit publication.·       User must have to enter the data in the fields of Name.·       User can select Active check box for active publication.·       User should have Submit and Reset buttons on this screen. 

import org.springframework.data.jpa.repository.JpaRepository;

import com.Data.sacdata.entity.Publishers;

public interface PublishersRepository extends JpaRepository<Publishers, Long> {
    List<Publishers> findByName(String name);
    List<Publishers> findByNameAndActive(String name, boolean active);
    List<Publishers> findByActive(boolean active);
    void deleteByName(String name);
}