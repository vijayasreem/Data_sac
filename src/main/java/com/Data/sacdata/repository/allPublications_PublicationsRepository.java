import org.springframework.data.jpa.repository.JpaRepository;

import com.Data.sacdata.model.allPublications_Publications;

public interface allPublications_PublicationsRepository extends JpaRepository<allPublications_Publications, Long> {

    List<allPublications_Publications> findAllByOrderByNameAsc();

}