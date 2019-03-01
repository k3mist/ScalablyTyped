package typings
package countryDashDataLib.countryDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  val alpha2: java.lang.String
  val alpha3: java.lang.String
  val bibliographic: java.lang.String
  val name: java.lang.String
}

object Language {
  @scala.inline
  def apply(
    alpha2: java.lang.String,
    alpha3: java.lang.String,
    bibliographic: java.lang.String,
    name: java.lang.String
  ): Language = {
    val __obj = js.Dynamic.literal(alpha2 = alpha2, alpha3 = alpha3, bibliographic = bibliographic, name = name)
  
    __obj.asInstanceOf[Language]
  }
}

