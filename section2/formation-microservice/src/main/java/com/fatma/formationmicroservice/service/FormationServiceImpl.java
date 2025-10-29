package com.fatma.formationmicroservice.service;



import com.fatma.formationmicroservice.dto.FormationDto;
import com.fatma.formationmicroservice.entites.Formation;
import com.fatma.formationmicroservice.repos.FormationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FormationServiceImpl implements FormationService {

    private FormationRepository formationRepository;

    @Override
    public FormationDto getFormationById(Long id) {
        Formation formation = formationRepository.findById(id).get();
        return new FormationDto(
                formation.getId(),
                formation.getNomFormation(),
                formation.getModeFormation()
        );
    }
}
