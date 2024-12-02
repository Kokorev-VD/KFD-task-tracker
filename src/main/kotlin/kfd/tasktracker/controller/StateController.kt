package kfd.tasktracker.controller

import kfd.tasktracker.model.request.StateRequest
import kfd.tasktracker.service.StateService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/states")
class StateController(
    val service: StateService
) {
    @GetMapping
    fun getAll() = service.getAll()
    @PostMapping
    fun create(@RequestBody request: StateRequest) = service.create(request)
    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Long) = service.delete(id)
}