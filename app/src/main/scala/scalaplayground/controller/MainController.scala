package scalaplayground.controller

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

import scala.util.Random

@RestController
@RequestMapping(path = Array("/api"))
class MainController{

  @GetMapping(path = Array("/rnd"))
  def getRandomInteger: Integer = {
    Random.nextInt(101)
  }

}
