package com.mundoNovo.mundoNovo.repository;

import com.mundoNovo.mundoNovo.enums.RoleName;
import com.mundoNovo.mundoNovo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
