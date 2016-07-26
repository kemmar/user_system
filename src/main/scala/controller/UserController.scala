package controller

import java.util.UUID

import domain.User
import io.circe.generic.auto._
import io.finch._
import io.finch.circe._

object UserController {

  lazy val createUserRoute = post("user" :: body.as[User]) { user: User =>
    Created {
      user.copy(id = Some(UUID.randomUUID()))
    }
  }
}
