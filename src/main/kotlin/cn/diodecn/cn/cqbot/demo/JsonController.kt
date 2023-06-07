package cn.diodecn.cn.cqbot.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/diodecn")
class JsonController {

    data class FunJsonResponse(val id: Int, val joke: String)

    @GetMapping("/me")
    fun getFunJsonResponse(): FunJsonResponse {
        val joke = "Why don't scientists trust atoms? Because they make up everything!"
        return FunJsonResponse(1, joke)
    }
}
