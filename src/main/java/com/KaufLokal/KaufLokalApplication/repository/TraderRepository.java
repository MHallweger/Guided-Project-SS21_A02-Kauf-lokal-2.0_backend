package com.KaufLokal.KaufLokalApplication.repository;

import com.KaufLokal.KaufLokalApplication.model.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TraderRepository extends JpaRepository<Trader, UUID> {
}
