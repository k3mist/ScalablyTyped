package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Generics
trait AdWordsEntity extends js.Object {
  var getEntityType: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

object AdWordsEntity {
  @scala.inline
  def apply(getEntityType: () => java.lang.String = null): AdWordsEntity = {
    val __obj = js.Dynamic.literal()
    if (getEntityType != null) __obj.updateDynamic("getEntityType")(js.Any.fromFunction0(getEntityType))
    __obj.asInstanceOf[AdWordsEntity]
  }
}

