package model

import slick.driver.MySQLDriver.api._

class Edge(tag : Tag) extends Table[Int, Int, Int](tag, "edge") {
  def id = column[Int]("id", O.PrimaryKey)

  def sourceVertexId = column[Int]("source_vertex")
  def source = foreignKey("source_vertex_fk", sourceVertexId, Vertex.vertexes)(_.id)

  def targetVertexId = column[Int]("target_vertex")
  def target = foreignKey("target_vertex_fk", targetVertexId, Vertex.vertexes)(_.id)

  override def toString = {
    "[source=" + sourceVertexId + ", target=" + targetVertexId + "]"
  }
}

object EdgeObj {

  val edges = TableQuery[Edge]

  def fromString(s: String): Edge = {
//    val split = s.split(" ")
//    val v1 = (Some, split.head, 0)
//    val v2 = new Vertex(split.tail.head)
//    val edge = (1, v1.id, v2.id)
//    edge
    //http://stackoverflow.com/questions/13114255/getting-autoincrement-values-with-slick-library-in-scala
    ???

  }
}
