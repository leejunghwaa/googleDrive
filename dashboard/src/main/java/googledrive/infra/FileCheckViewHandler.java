package googledrive.infra;

import googledrive.config.kafka.KafkaProcessor;
import googledrive.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class FileCheckViewHandler {

    @Autowired
    private FileCheckRepository fileCheckRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_1(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            FileCheck fileCheck = new FileCheck();
            // view 객체에 이벤트의 Value 를 set 함
            fileCheck.setId(fileUploaded.getFiledId());
            // view 레파지 토리에 save
            fileCheckRepository.save(fileCheck);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_2(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            FileCheck fileCheck = new FileCheck();
            // view 객체에 이벤트의 Value 를 set 함
            fileCheck.setName(fileUploaded.getFileName());
            // view 레파지 토리에 save
            fileCheckRepository.save(fileCheck);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @StreamListener(KafkaProcessor.INPUT)
    public void whenFileUploaded_then_CREATE_3(
        @Payload FileUploaded fileUploaded
    ) {
        try {
            if (!fileUploaded.validate()) return;

            // view 객체 생성
            FileCheck fileCheck = new FileCheck();
            // view 객체에 이벤트의 Value 를 set 함
            fileCheck.setSize(fileUploaded.getFileSize());
            // view 레파지 토리에 save
            fileCheckRepository.save(fileCheck);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
