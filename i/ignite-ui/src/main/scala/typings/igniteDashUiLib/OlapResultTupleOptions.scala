package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlapResultTupleOptions
  extends /**
	 * Option for OlapResultTupleOptions
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Optional="false" array of $.ig.OlapResultAxisMember objects which form the tuple object.
  	 */
  var members: js.UndefOr[js.Array[_]] = js.undefined
}

object OlapResultTupleOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for OlapResultTupleOptions
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    members: js.Array[_] = null
  ): OlapResultTupleOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (members != null) __obj.updateDynamic("members")(members)
    __obj.asInstanceOf[OlapResultTupleOptions]
  }
}

