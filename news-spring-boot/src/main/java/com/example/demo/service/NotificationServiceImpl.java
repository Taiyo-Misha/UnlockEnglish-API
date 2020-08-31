package com.example.demo.service;

import com.example.demo.entity.Notification;
import com.example.demo.model.dto.NotificationDto;
import com.example.demo.model.mapper.NotificationMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NotificationServiceImpl implements NotificationService{
    private static ArrayList<Notification> notis = new ArrayList<Notification>();

    static {
        notis.add(new Notification(1,
                "12:00",
                "Thong bao nghi hoc",
                "Thong bao toan the hoc sinh lich nghi le 2/9"));
    }

    @Override
    public List<NotificationDto> getListNotification() {
        List<NotificationDto> result = new ArrayList<NotificationDto>();
        for(Notification noti : notis){
            result.add(NotificationMapper.toNotificationDto(noti));
        }
        return result;
    }
}
