package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoStreamed extends AbstractEvent {

    private Long id;

    public VideoStreamed(Video aggregate) {
        super(aggregate);
    }

    public VideoStreamed() {
        super();
    }
}
