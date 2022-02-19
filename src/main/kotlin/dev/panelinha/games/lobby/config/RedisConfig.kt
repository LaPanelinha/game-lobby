package dev.panelinha.games.lobby.config

import io.lettuce.core.RedisURI
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisPassword
import org.springframework.data.redis.connection.RedisStandaloneConfiguration
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.RedisTemplate

@Configuration
class RedisConfig {

    @Value("\${spring.redis.url}")
    lateinit var redisUrl: String

    @Bean
    fun lettuceConnectionFactory(): LettuceConnectionFactory {
        val uri = RedisURI.create(redisUrl)
        val config = RedisStandaloneConfiguration(uri.host, uri.port).apply {
            password = RedisPassword.of(uri.password)
            username = uri.username
        }

        return LettuceConnectionFactory(config)
    }

    @Bean
    fun redisTemplate() = RedisTemplate<String, Object>().apply {
        setConnectionFactory(lettuceConnectionFactory())
    }
}
