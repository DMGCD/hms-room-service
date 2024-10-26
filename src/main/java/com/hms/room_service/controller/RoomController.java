package com.hms.room_service.controller;

import com.hotel.model_service.controller.CommonController;
import com.hotel.model_service.model.Room;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface RoomController extends CommonController<Room, Integer> {
@PostMapping("/save")
    ResponseEntity<Room> add(Room t) throws Exception;

    ResponseEntity<List<Room>> getAll() throws Exception;

    ResponseEntity<Room> findById(Integer id) throws Exception;

    ResponseEntity<Room> update(Room t, Integer id) throws Exception;

    ResponseEntity<String> delete(Integer id) throws Exception;

}
