package dev.panelinha.games.lobby.domain

import org.springframework.data.redis.core.RedisHash
import java.io.Serializable

@RedisHash("lobby")
data class Lobby(
    var id: String?,
    var name: String?
) : Serializable
