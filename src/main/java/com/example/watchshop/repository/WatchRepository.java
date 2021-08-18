package com.example.watchshop.repository;

import com.example.watchshop.domain.Watch;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author martsiomchyk
 */

public interface WatchRepository extends JpaRepository<Watch, Long> {
}
