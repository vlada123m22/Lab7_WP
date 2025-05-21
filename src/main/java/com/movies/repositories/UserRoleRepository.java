package com.movies.repositories;


import com.movies.entities.UserRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRoleRepository extends CrudRepository<UserRole,Long> {
    UserRole getUserRoleById(Long id);
    @Query("SELECT ur FROM UserRole ur WHERE ur.roleName= :roleName")
    UserRole getUserRoleByName(String roleName);

}