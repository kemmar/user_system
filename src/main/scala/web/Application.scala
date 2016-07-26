package web

import application.AppConfig
import com.twitter.finagle.Http
import com.twitter.util.Await

object Application extends App {
  Await.ready(Http.server.serve(s":${AppConfig.port}", Routes.buildRoutes))
}