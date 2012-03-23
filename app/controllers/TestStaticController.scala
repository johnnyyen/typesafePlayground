package controllers

import play.api._
import play.api.mvc._

object TestStaticController extends Controller {
  def index = Action {
    Ok(views.html.testStatic("Lets see if this routes"))
  }
}