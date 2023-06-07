package cn.diodecn.cn.cqbot.demo

import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.stereotype.Controller

@Controller
class WebSocketController {

    @MessageMapping("/websocket")
    @SendTo("/topic/messages")
    fun receiveMessage(headerAccessor: SimpMessageHeaderAccessor): String {
        val message = headerAccessor.sessionAttributes?.get("message") ?: "No message"
        println("Received WebSocket message: $message")
        return "Message received"
    }
}
