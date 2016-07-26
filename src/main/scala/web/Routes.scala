package web

import application.RouteConfig
import com.twitter.finagle.Service
import com.twitter.finagle.http.{Request, Response}
import controller.UserController
import io.circe.generic.auto._
import io.finch.circe._

object Routes extends RouteConfig {
  override def buildRoutes: Service[Request, Response] = routeErrorHandler(
    UserController.createUserRoute
  ).toService
}