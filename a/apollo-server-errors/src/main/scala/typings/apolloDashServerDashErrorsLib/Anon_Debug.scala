package typings
package apolloDashServerDashErrorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Debug extends js.Object {
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[
    js.Function1[
      /* error */ graphqlLib.graphqlMod.GraphQLError, 
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError
    ]
  ] = js.undefined
}

object Anon_Debug {
  @scala.inline
  def apply(
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: js.Function1[
      /* error */ graphqlLib.graphqlMod.GraphQLError, 
      graphqlLib.errorFormatErrorMod.GraphQLFormattedError
    ] = null
  ): Anon_Debug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    __obj.asInstanceOf[Anon_Debug]
  }
}

