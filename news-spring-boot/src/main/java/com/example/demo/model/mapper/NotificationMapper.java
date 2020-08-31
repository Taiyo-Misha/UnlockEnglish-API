package com.example.demo.model.mapper;

import com.example.demo.entity.News;
import com.example.demo.entity.Notification;
import com.example.demo.model.dto.NewsDto;
import com.example.demo.model.dto.NotificationDto;

public class NotificationMapper {
    public static NotificationDto toNotificationDto(Notification notis){
        NotificationDto tmp = new NotificationDto();
        tmp.setId(notis.getId());
        tmp.setTime(notis.getTime());
        tmp.setTitle(notis.getTitle());
        tmp.setText(notis.getText());

        return tmp;

    }
}
