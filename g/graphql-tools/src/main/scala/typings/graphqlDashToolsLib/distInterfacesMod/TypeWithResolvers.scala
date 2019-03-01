package typings
package graphqlDashToolsLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeWithResolvers extends js.Object {
  var resolvers: js.UndefOr[IResolvers[_, _]] = js.undefined
  var `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType
}

object TypeWithResolvers {
  @scala.inline
  def apply(`type`: graphqlLib.typeDefinitionMod.GraphQLNamedType, resolvers: IResolvers[_, _] = null): TypeWithResolvers = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers)
    __obj.asInstanceOf[TypeWithResolvers]
  }
}

