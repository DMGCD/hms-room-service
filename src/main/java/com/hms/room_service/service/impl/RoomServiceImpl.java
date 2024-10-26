package com.hms.room_service.service.impl;

import com.hms.room_service.service.RoomService;
import com.hotel.model_service.model.Room;

import com.hotel.model_service.repository.RoomRepository;
import com.hotel.model_service.service.impl.CommonServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl extends CommonServiceImpl<Room,Integer, RoomRepository> implements RoomService {
   RoomServiceImpl(RoomRepository repository){
       super();
   }

}


