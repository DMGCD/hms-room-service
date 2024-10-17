package com.hms.room_service.controller;

import com.hotel.model_service.controller.CommonController;
import com.hotel.model_service.model.Room;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface RoomController extends CommonController<Room, Integer> {

    ResponseEntity<Room> add(Room t) throws Exception;

    ResponseEntity<List<Room>> getAll() throws Exception;

    ResponseEntity<Room> findById(Integer id) throws Exception;

    ResponseEntity<Room> findById(Room o) throws Exception;

    ResponseEntity<Room> update(Room t, Integer id) throws Exception;

    ResponseEntity<String> delete(Integer id) throws Exception;
    @GetMapping("/say/{val}")
    ResponseEntity<String> say(@PathVariable("val")String val) throws Exception;
    @GetMapping("/say")
    ResponseEntity<String> thank();
}
