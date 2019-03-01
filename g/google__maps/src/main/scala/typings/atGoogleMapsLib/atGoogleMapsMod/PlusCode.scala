package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlusCode extends js.Object {
  /** is a 6 character or longer local code with an explicit location (CWC8+R9, Mountain View, CA, USA). */
  var compound_code: java.lang.String
  /** is a 4 character area code and 6 character or longer local code (849VCWC8+R9). */
  var global_code: java.lang.String
}

object PlusCode {
  @scala.inline
  def apply(compound_code: java.lang.String, global_code: java.lang.String): PlusCode = {
    val __obj = js.Dynamic.literal(compound_code = compound_code, global_code = global_code)
  
    __obj.asInstanceOf[PlusCode]
  }
}

