package model

import sorm._

object DB extends Instance(entities = Seq(
  Entity[Person](),
  Entity[Vertex](),
  Entity[Edge](),
  Entity[Path]()), url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1")
