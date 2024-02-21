package com.rungroup.rungroup.service;

import com.rungroup.rungroup.dto.EventDto;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);
}
