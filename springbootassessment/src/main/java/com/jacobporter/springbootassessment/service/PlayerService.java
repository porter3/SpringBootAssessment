package com.jacobporter.springbootassessment.service;

import com.jacobporter.springbootassessment.PlayerField;
import com.jacobporter.springbootassessment.domainEntities.Player;

import java.util.List;

public interface PlayerService {

    Player getPlayer(int playerId);
    Player addPlayer(Player player);
    Player updatePlayer(Player player);
    void deletePlayer(int playerId);
    List<Player> searchPlayers(PlayerField field, String searchValue);
}