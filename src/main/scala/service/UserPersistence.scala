package service

import application.ServiceConfig

object UserPersistence extends ServiceConfig{
  override val serviceName: String = "user-persistence"
}
