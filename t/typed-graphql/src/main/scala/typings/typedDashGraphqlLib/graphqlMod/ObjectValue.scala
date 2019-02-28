package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectValue
  extends Node
     with Value {
  var fields: js.Array[ObjectField]
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
}

