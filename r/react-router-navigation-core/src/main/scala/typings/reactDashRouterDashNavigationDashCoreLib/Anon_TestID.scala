package typings
package reactDashRouterDashNavigationDashCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TestID extends js.Object {
  var testID: js.UndefOr[java.lang.String] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_TestID {
  @scala.inline
  def apply(testID: java.lang.String = null, title: java.lang.String = null): Anon_TestID = {
    val __obj = js.Dynamic.literal()
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_TestID]
  }
}

