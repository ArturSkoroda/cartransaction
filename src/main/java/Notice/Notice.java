package Notice;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class Notice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long noticeId;
    private NoticeType noticeType;
    private Contact contact;

}
