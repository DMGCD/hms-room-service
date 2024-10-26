package com.hms.room_service.controller.impl;

import com.hms.room_service.controller.RoomController;
import com.hms.room_service.service.RoomService;
import com.hotel.model_service.controller.impl.CommonControllerImpl;
import com.hotel.model_service.model.Room;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("room")
public class RoomControllerImpl extends CommonControllerImpl<Room, Integer, RoomService> implements RoomController {


    public RoomControllerImpl(RoomService service) {
        super(service);
    }


}
