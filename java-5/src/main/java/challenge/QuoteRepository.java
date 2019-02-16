package challenge;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends JpaRepository<Quote,Integer> {


    @Query(value = "SELECT q FROM  Quote q WHERE q.actor = :actor")
    Quote getQuoteByActor(@Param("actor")String actor);


}
