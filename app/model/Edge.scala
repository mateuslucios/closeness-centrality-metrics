package model

class Edge(source: Vertex, target: Vertex) {

  override def toString = {
    "[source=" + source + ", target=" + target + "]"
  }
}

object Edge {
  def fromString(s: String): Edge = {
    val split = s.split(" ")
    val v1 = new Vertex(split.head)
    val v2 = new Vertex(split.tail.head)
    new Edge(v1, v2)
  }
}
