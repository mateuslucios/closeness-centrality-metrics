package model

import slick.driver.MySQLDriver.api._
import slick.lifted.ProvenShape

class Vertex(tag : Tag) extends Table[(Int, String, Int)] (tag, "vertex"){
  def id = column[Int]("id", O.PrimaryKey)
  def name = column[String]("name")
  def rank = column[Int]("rank")

  override def * : ProvenShape[(Int, String, Int)] = (id, name, rank)

  override def toString = name.toString

}

object Vertex {
  val vertexes = TableQuery[Vertex]
}

