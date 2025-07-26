package com.devcrush.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcrush.model.Room;

public interface RoomRepository extends JpaRepository<Room, Integer>{

}
