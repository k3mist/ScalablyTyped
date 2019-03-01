package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLEnumValueConfig extends js.Object {
  var deprecationReason: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object GraphQLEnumValueConfig {
  @scala.inline
  def apply(
    deprecationReason: java.lang.String = null,
    description: java.lang.String = null,
    value: js.Any = null
  ): GraphQLEnumValueConfig = {
    val __obj = js.Dynamic.literal()
    if (deprecationReason != null) __obj.updateDynamic("deprecationReason")(deprecationReason)
    if (description != null) __obj.updateDynamic("description")(description)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GraphQLEnumValueConfig]
  }
}

