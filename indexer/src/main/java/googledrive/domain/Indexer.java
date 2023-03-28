package googledrive.domain;

import googledrive.IndexerApplication;
import googledrive.domain.FileIndexed;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Indexer_table")
@Data
public class Indexer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String fileid;

    @ElementCollection
    private List<String> keyword;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexerRepository repository() {
        IndexerRepository indexerRepository = IndexerApplication.applicationContext.getBean(
            IndexerRepository.class
        );
        return indexerRepository;
    }

    public static void inexFile(FileUploaded fileUploaded) {
        /** Example 1:  new item 
        Indexer indexer = new Indexer();
        repository().save(indexer);

        FileIndexed fileIndexed = new FileIndexed(indexer);
        fileIndexed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(indexer->{
            
            indexer // do something
            repository().save(indexer);

            FileIndexed fileIndexed = new FileIndexed(indexer);
            fileIndexed.publishAfterCommit();

         });
        */

    }
}
