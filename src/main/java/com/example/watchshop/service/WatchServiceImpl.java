package com.example.watchshop.service;

import com.example.watchshop.domain.Watch;
import com.example.watchshop.mapper.WatchMapper;
import com.example.watchshop.model.WatchDTO;
import com.example.watchshop.repository.WatchRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @author martsiomchyk
 */
@Service
@AllArgsConstructor
public class WatchServiceImpl implements WatchService {

    private final WatchRepository watchRepository;
    private final WatchMapper watchMapper;

    @Override
    public WatchDTO createNewWatch(WatchDTO watchDTO) {

        Watch savedWatch = watchRepository.save(watchMapper.watchDTOToWatch(watchDTO));
        WatchDTO returnDto = watchMapper.watchToWatchDTO(savedWatch);

        return returnDto;
    }
}
