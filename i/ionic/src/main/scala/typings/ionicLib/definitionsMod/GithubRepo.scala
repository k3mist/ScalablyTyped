package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GithubRepo extends js.Object {
  var full_name: java.lang.String
  var id: scala.Double
}

object GithubRepo {
  @scala.inline
  def apply(full_name: java.lang.String, id: scala.Double): GithubRepo = {
    val __obj = js.Dynamic.literal(full_name = full_name, id = id)
  
    __obj.asInstanceOf[GithubRepo]
  }
}

