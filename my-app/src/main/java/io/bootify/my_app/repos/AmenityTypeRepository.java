package io.bootify.my_app.repos;

import io.bootify.my_app.domain.AmenityType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AmenityTypeRepository extends JpaRepository<AmenityType, Long> {
}
