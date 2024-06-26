package com.eventostec.api.domain.event;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.UUID;

public record EventRequestDto(
        String title,
        String description,
        Date date,
        String city,
        String state,
        String eventUrl,
        Boolean remote,
        MultipartFile image) {
}
