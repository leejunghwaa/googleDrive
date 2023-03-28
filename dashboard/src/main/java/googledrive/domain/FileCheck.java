package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "FileCheck_table")
@Data
public class FileCheck {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String id;

    private String name;
    private Boolean isIndexed;
    private Boolean isUploaded;
    private String videoUrl;
    private String size;
}
