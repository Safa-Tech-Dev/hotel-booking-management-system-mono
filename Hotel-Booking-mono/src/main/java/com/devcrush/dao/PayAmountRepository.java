package com.devcrush.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcrush.model.PayAmount;

public interface PayAmountRepository extends JpaRepository<PayAmount, Integer> {

}
