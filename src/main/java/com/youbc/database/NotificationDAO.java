package com.youbc.database;

import com.youbc.models.notification.Notification;
import com.youbc.models.notification.NotificationMessage;
import org.jooq.DSLContext;
import org.jooq.Record5;
import org.jooq.RecordMapper;
import org.jooq.Result;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.youbc.generated.schema.tables.PendingNotification.PENDING_NOTIFICATION;

@Component
public class NotificationDAO {

    private DSLContext dslContext;

    @Autowired
    public NotificationDAO(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public List<Notification> getUserNotifications(String userId) {
        Result<Record5<Integer, String, String, String, String>> results = dslContext
                .select(
                        PENDING_NOTIFICATION.ID,
                        PENDING_NOTIFICATION.SUBJECT,
                        PENDING_NOTIFICATION.USERNAME,
                        PENDING_NOTIFICATION.WECHATID,
                        PENDING_NOTIFICATION.THUMBNAIL_IMAGE_URL
                )
                .from(PENDING_NOTIFICATION)
                .where(PENDING_NOTIFICATION.SUBJECT.eq(userId))
                .fetch();
        return results.map(
                record -> {
                        NotificationMessage message = new NotificationMessage(
                                record.get(PENDING_NOTIFICATION.WECHATID),
                                record.get(PENDING_NOTIFICATION.USERNAME),
                                record.get(PENDING_NOTIFICATION.THUMBNAIL_IMAGE_URL)
                        );
                        return new Notification(
                                record.get(PENDING_NOTIFICATION.ID),
                                record.get(PENDING_NOTIFICATION.SUBJECT),
                                message
                        );
                    }
        );
    }

    public void createNewNotification(String subjectToNotify, String username, String wechatId, String imageUrl) {
        dslContext.insertInto(PENDING_NOTIFICATION)
                .set(PENDING_NOTIFICATION.SUBJECT, subjectToNotify)
                .set(PENDING_NOTIFICATION.USERNAME, username)
                .set(PENDING_NOTIFICATION.WECHATID, wechatId)
                .set(PENDING_NOTIFICATION.THUMBNAIL_IMAGE_URL, imageUrl)
                .set(PENDING_NOTIFICATION.TIME_CREATED, DSL.currentTimestamp())
                .execute();
    }

    public void deleteNotification(Integer notificationId) {
        dslContext.deleteFrom(PENDING_NOTIFICATION)
                .where(PENDING_NOTIFICATION.ID.eq(notificationId))
                .execute();
    }

}
