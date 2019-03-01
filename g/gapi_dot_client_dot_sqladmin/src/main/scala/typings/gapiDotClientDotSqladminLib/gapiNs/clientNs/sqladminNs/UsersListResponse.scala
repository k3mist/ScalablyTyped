package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListResponse extends js.Object {
  /** List of user resources in the instance. */
  var items: js.UndefOr[js.Array[User]] = js.undefined
  /** This is always sql#usersList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the
    * operation.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object UsersListResponse {
  @scala.inline
  def apply(
    items: js.Array[User] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): UsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[UsersListResponse]
  }
}

