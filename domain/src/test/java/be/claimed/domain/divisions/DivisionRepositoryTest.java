package be.claimed.domain.divisions;

import be.claimed.domain.DomainConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(DomainConfig.class)
class DivisionRepositoryTest {
    private DivisionRepository divisionRepository;

//    public DivisionRepositoryTest() {
//
//    }

    @Autowired
    public DivisionRepositoryTest(DivisionRepository divisionRepository) {
        this.divisionRepository = divisionRepository;
    }

    @Test
    void create_shouldCreateDivisionInDB() {
        //GIVEN
        Division division = new Division( "dfs", "sdf", "sdf", 1);

        //WHEN
        divisionRepository.create(division);

        //THEN
        Assertions.assertThat(division.getId()).isNotNull();
    }
}