package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BuildNumber extends js.Object {
  var buildNumber: java.lang.String
  var model: java.lang.String
  var platform: java.lang.String
  var userInterfaceIdiom: java.lang.String
}

object Anon_BuildNumber {
  @scala.inline
  def apply(
    buildNumber: java.lang.String,
    model: java.lang.String,
    platform: java.lang.String,
    userInterfaceIdiom: java.lang.String
  ): Anon_BuildNumber = {
    val __obj = js.Dynamic.literal(buildNumber = buildNumber, model = model, platform = platform, userInterfaceIdiom = userInterfaceIdiom)
  
    __obj.asInstanceOf[Anon_BuildNumber]
  }
}

