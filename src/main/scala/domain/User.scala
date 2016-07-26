package domain

import java.util.UUID

case class User(id: Option[UUID] = None, name: String, friends: Option[List[User]] = None)
