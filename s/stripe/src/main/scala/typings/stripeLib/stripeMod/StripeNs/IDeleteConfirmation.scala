package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeleteConfirmation extends js.Object {
  var deleted: scala.Boolean
  var id: java.lang.String
  var `object`: java.lang.String
}

object IDeleteConfirmation {
  @scala.inline
  def apply(deleted: scala.Boolean, id: java.lang.String, `object`: java.lang.String): IDeleteConfirmation = {
    val __obj = js.Dynamic.literal(deleted = deleted, id = id, `object` = `object`)
  
    __obj.asInstanceOf[IDeleteConfirmation]
  }
}

