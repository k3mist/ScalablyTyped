package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancelled extends js.Object {
  var cancelled: scala.Double
  var error: scala.Double
  var published: scala.Double
  var unpublished: scala.Double
}

object Anon_Cancelled {
  @scala.inline
  def apply(cancelled: scala.Double, error: scala.Double, published: scala.Double, unpublished: scala.Double): Anon_Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled, error = error, published = published, unpublished = unpublished)
  
    __obj.asInstanceOf[Anon_Cancelled]
  }
}

