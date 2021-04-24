package com.jacobporter.springbootassessment.controllers;

import com.jacobporter.springbootassessment.domainEntities.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("player")
public class PlayerController {

    @GetMapping("/get")
    public ResponseEntity<Player> getPlayer() {

    }

    @PostMapping("/add")
    public ResponseEntity<Player> addPlayer() {

    }

    @PatchMapping("/update")
    public ResponseEntity<Player> updatePlayer() {

    }

    @DeleteMapping("/delete")
    public HttpStatus deletePlayer() {

    }

    @GetMapping("/search")
    public List<Player> searchPlayers() {

    }
}