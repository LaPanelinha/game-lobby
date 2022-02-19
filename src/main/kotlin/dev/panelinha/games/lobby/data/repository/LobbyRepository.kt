package dev.panelinha.games.lobby.data.repository

import dev.panelinha.games.lobby.domain.Lobby
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LobbyRepository : CrudRepository<Lobby, String>
