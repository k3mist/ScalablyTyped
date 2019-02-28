package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonNullType
  extends Node
     with Type {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var `type`: NamedType | ListType
}

