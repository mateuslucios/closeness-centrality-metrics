package model

import sorm._

object DB extends Instance(entities = Seq(Entity[Person]()), url = "jdbc:h2:mem:test")
