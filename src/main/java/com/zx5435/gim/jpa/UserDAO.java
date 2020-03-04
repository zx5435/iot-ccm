package com.zx5435.gim.jpa;

import com.zx5435.gim.model.UserDO;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDAO extends JpaRepository<UserDO, Integer> {

    @NotNull
    @Override
    Optional<UserDO> findById(@NotNull Integer integer);
}
