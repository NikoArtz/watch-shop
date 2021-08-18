package com.example.watchshop.controller;


import com.example.watchshop.model.WatchDTO;
import com.example.watchshop.service.WatchService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author martsiomchyk
 */
@RestController
@RequestMapping(WatchController.BASE_URL)
@AllArgsConstructor
public class WatchController {

    public static final String BASE_URL = "/api/v1/";

    private final WatchService watchService;

    @PostMapping("create")
    @ResponseStatus(HttpStatus.CREATED)
    public WatchDTO createCustomer(@RequestBody WatchDTO watchDTO) {
        return watchService.createNewWatch(watchDTO);
    }
}
