package typings
package atPulumiCloudLib.httpServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpServer extends js.Object {
  val url: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String]
}

object HttpServer {
  @scala.inline
  def apply(url: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String]): HttpServer = {
    val __obj = js.Dynamic.literal(url = url)
  
    __obj.asInstanceOf[HttpServer]
  }
}

