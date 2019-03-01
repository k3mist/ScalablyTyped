package typings
package envDashPathsLib.envDashPathsMod.envPathsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Paths extends js.Object {
  val cache: java.lang.String
  val config: java.lang.String
  val data: java.lang.String
  val log: java.lang.String
  val temp: java.lang.String
}

object Paths {
  @scala.inline
  def apply(
    cache: java.lang.String,
    config: java.lang.String,
    data: java.lang.String,
    log: java.lang.String,
    temp: java.lang.String
  ): Paths = {
    val __obj = js.Dynamic.literal(cache = cache, config = config, data = data, log = log, temp = temp)
  
    __obj.asInstanceOf[Paths]
  }
}

