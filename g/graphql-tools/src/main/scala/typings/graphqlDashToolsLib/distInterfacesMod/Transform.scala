package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var transformRequest: js.UndefOr[js.Function1[/* originalRequest */ Request, Request]] = js.undefined
  var transformResult: js.UndefOr[js.Function1[/* result */ Result, Result]] = js.undefined
  var transformSchema: js.UndefOr[
    js.Function1[
      /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
      graphqlLib.graphqlMod.GraphQLSchema
    ]
  ] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    transformRequest: js.Function1[/* originalRequest */ Request, Request] = null,
    transformResult: js.Function1[/* result */ Result, Result] = null,
    transformSchema: js.Function1[
      /* schema */ graphqlLib.graphqlMod.GraphQLSchema, 
      graphqlLib.graphqlMod.GraphQLSchema
    ] = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (transformRequest != null) __obj.updateDynamic("transformRequest")(transformRequest)
    if (transformResult != null) __obj.updateDynamic("transformResult")(transformResult)
    if (transformSchema != null) __obj.updateDynamic("transformSchema")(transformSchema)
    __obj.asInstanceOf[Transform]
  }
}

