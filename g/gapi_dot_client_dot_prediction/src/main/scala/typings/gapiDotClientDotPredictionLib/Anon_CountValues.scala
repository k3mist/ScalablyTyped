package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CountValues extends js.Object {
  /** Number of categorical values for this feature in the data. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** List of all the categories for this feature in the data set. */
  var values: js.UndefOr[js.Array[Anon_Count]] = js.undefined
}

object Anon_CountValues {
  @scala.inline
  def apply(count: java.lang.String = null, values: js.Array[Anon_Count] = null): Anon_CountValues = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Anon_CountValues]
  }
}

