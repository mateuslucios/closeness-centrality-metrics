package controllers

import java.io.{BufferedReader, File, FileReader}

import model.{DB, Edge}
import play.api.mvc.{Action, Controller}

import scala.collection.mutable

class FileUpload extends Controller {
  def upload = Action(parse.multipartFormData) { request =>
    request.body.file("file").map {
      data => data.ref.moveTo(new File("temp_file.txt"))
    }.getOrElse {
      Redirect(routes.Application.index)
    }

    val reader = new BufferedReader(new FileReader(new File("temp_file.txt")))

    var lines = new mutable.MutableList[String]
    while (reader.ready){
        lines += reader.readLine
    }

    println(lines.size)

    val edges = for(line <- lines) yield Edge.fromString(line)

    for (edge <- edges) {
      println(edge)
      //DB.save(edge)
    }

    Ok("File has been uploaded")
  }

}
