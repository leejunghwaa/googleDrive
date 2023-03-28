package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;

    public FileIndexed(Indexer aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
