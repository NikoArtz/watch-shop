package com.example.watchshop.service;

import com.example.watchshop.model.WatchDTO;

/**
 * @author martsiomchyk
 */

public interface WatchService {
    WatchDTO createNewWatch(WatchDTO customerDTO);

}
