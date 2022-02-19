package dev.panelinha.games.lobby.service

import dev.panelinha.games.lobby.data.repository.LobbyRepository
import dev.panelinha.games.lobby.domain.Lobby
import org.springframework.stereotype.Service

@Service
class LobbyService(
    val repository: LobbyRepository
) {

    fun getAll() = repository.findAll().toList()
    fun createLobby(lobby: Lobby) = repository.save(lobby)
    fun deleteAll() = repository.deleteAll()
}