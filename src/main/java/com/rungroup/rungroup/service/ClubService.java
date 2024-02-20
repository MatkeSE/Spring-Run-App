package com.rungroup.rungroup.service;

import com.rungroup.rungroup.dto.ClubDto;
import com.rungroup.rungroup.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
    Club saveClub(Club club);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);
}
