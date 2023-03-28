package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private String customerId;
    private String fileName;
    private String filedId;
    private String fileLocation;
    private String fileSize;
}
