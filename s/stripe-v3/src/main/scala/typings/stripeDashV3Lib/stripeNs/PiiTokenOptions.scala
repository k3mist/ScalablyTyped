package typings
package stripeDashV3Lib.stripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PiiTokenOptions extends js.Object {
  var personal_id_number: java.lang.String
}

object PiiTokenOptions {
  @scala.inline
  def apply(personal_id_number: java.lang.String): PiiTokenOptions = {
    val __obj = js.Dynamic.literal(personal_id_number = personal_id_number)
  
    __obj.asInstanceOf[PiiTokenOptions]
  }
}

