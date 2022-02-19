package dev.panelinha.games.lobby.controller

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/lobby")
class LobbyController {

    @GetMapping
    fun index() = ResponseEntity.ok(mapOf("message" to "Hello World!"))
}
