package hello

import scala.beans.BeanProperty

//case class Response(@BeanProperty message: String, @BeanProperty request: Request)
case class Response(@BeanProperty statusCode: Int, @BeanProperty body: String)
