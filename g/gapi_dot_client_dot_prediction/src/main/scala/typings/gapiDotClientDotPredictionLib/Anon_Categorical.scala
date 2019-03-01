package typings
package gapiDotClientDotPredictionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Categorical extends js.Object {
  /** Description of the categorical values of this feature. */
  var categorical: js.UndefOr[Anon_CountValues] = js.undefined
  /** The feature index. */
  var index: js.UndefOr[java.lang.String] = js.undefined
  /** Description of the numeric values of this feature. */
  var numeric: js.UndefOr[Anon_CountMean] = js.undefined
  /** Description of multiple-word text values of this feature. */
  var text: js.UndefOr[Anon_CountString] = js.undefined
}

object Anon_Categorical {
  @scala.inline
  def apply(
    categorical: Anon_CountValues = null,
    index: java.lang.String = null,
    numeric: Anon_CountMean = null,
    text: Anon_CountString = null
  ): Anon_Categorical = {
    val __obj = js.Dynamic.literal()
    if (categorical != null) __obj.updateDynamic("categorical")(categorical)
    if (index != null) __obj.updateDynamic("index")(index)
    if (numeric != null) __obj.updateDynamic("numeric")(numeric)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Anon_Categorical]
  }
}

