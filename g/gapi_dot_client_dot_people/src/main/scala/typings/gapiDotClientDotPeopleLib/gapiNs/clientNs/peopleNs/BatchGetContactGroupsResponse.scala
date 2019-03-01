package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetContactGroupsResponse extends js.Object {
  /** The list of responses for each requested contact group resource. */
  var responses: js.UndefOr[js.Array[ContactGroupResponse]] = js.undefined
}

object BatchGetContactGroupsResponse {
  @scala.inline
  def apply(responses: js.Array[ContactGroupResponse] = null): BatchGetContactGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (responses != null) __obj.updateDynamic("responses")(responses)
    __obj.asInstanceOf[BatchGetContactGroupsResponse]
  }
}

