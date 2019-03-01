package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLResult extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLError]] = js.undefined
}

object GraphQLResult {
  @scala.inline
  def apply(data: js.Any = null, errors: js.Array[GraphQLError] = null): GraphQLResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[GraphQLResult]
  }
}

