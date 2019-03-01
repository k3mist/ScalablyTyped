package typings
package gapiDotTranslateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FieldsTarget extends js.Object {
  /**
  			 * Selector specifying which fields to include in a partial response.
  			 */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
  			 * the language and collation in which the localized results should be returned
  			 */
  var target: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FieldsTarget {
  @scala.inline
  def apply(fields: java.lang.String = null, target: java.lang.String = null): Anon_FieldsTarget = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Anon_FieldsTarget]
  }
}

