package dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Setter
@ToString
@Getter
public class MeetUpDetailsDto {
        private LocalDate date;
        private LocalTime time;
        private String personname;
        private String place;
        private String gift;

        private LocalDateTime createdOn;
        private String createdBy;
        private LocalDateTime updateOn;
        private String updatedBy;


}
