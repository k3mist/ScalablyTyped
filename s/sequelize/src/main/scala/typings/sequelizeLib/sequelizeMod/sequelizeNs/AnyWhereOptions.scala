package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A hash of attributes to describe your search, accepting any field names. See `WhereOptions` for details.
  */
trait AnyWhereOptions
  extends /* field */ org.scalablytyped.runtime.StringDictionary[js.Array[WhereOptions[_]] | js.Object]

object AnyWhereOptions {
  @scala.inline
  def apply(
    StringDictionary: /* field */ org.scalablytyped.runtime.StringDictionary[js.Array[WhereOptions[_]] | js.Object] = null
  ): AnyWhereOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnyWhereOptions]
  }
}

