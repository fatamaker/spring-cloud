package com.fatma.formationmicroservice.service;


import com.fatma.formationmicroservice.dto.FormationDto;

public interface FormationService {
    FormationDto getFormationById(Long id);
}
