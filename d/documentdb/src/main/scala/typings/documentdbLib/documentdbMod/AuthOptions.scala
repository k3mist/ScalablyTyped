package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  /** The authorization master key to use to create the client. */
  var masterKey: js.UndefOr[java.lang.String] = js.undefined
  /** An array of {@link Permission} objects. */
  var permissionFeed: js.UndefOr[js.Array[Permission]] = js.undefined
  /** An object that contains resources tokens. Keys for the object are resource Ids and values are the resource tokens. */
  var resourceTokens: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    masterKey: java.lang.String = null,
    permissionFeed: js.Array[Permission] = null,
    resourceTokens: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (masterKey != null) __obj.updateDynamic("masterKey")(masterKey)
    if (permissionFeed != null) __obj.updateDynamic("permissionFeed")(permissionFeed)
    if (resourceTokens != null) __obj.updateDynamic("resourceTokens")(resourceTokens)
    __obj.asInstanceOf[AuthOptions]
  }
}

