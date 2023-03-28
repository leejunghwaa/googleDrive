package googledrive.domain;

import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class FileUploaded extends AbstractEvent {

    private String CustomerId;
    private String FileName;
    private String FiledId;
    private String fileLocation;
    private String fileSize;
}
