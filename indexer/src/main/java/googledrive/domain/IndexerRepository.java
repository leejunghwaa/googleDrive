package googledrive.domain;

import googledrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "indexers", path = "indexers")
public interface IndexerRepository
    extends PagingAndSortingRepository<Indexer, String> {}
