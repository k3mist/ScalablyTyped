package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Resource extends js.Object {
  var resource: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
}

object Anon_Resource {
  @scala.inline
  def apply(`type`: java.lang.String, resource: java.lang.String = null): Anon_Resource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Anon_Resource]
  }
}

