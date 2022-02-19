package dev.panelinha.games.lobby.controller

import dev.panelinha.games.lobby.domain.Lobby
import dev.panelinha.games.lobby.service.LobbyService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/lobby")
class LobbyController(
    val service: LobbyService
) {
    @GetMapping
    fun index() = ResponseEntity.ok(service.getAll())

    @PostMapping
    fun createLobby(@RequestBody lobby: Lobby) = ResponseEntity.ok(service.createLobby(lobby))

    @DeleteMapping
    fun deleteAllLobbies() = ResponseEntity.ok(service.deleteAll())
}
