package com.example.watchshop.mapper;

import com.example.watchshop.domain.Watch;
import com.example.watchshop.model.WatchDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.Base64;

@Mapper
public interface WatchMapper {

    WatchMapper INSTANCE = Mappers.getMapper(WatchMapper.class);
    

    WatchDTO watchToWatchDTO(Watch customer);

    Watch watchDTOToWatch(WatchDTO customerDTO);


    default byte[] map(String base64) {
        return base64 != null ? Base64.getDecoder().decode(base64) : new byte[0];
    }

 
    default String map(byte[] array) {
        return array.length != 0 ? Base64.getEncoder().encodeToString(array) : null;
    }
}
