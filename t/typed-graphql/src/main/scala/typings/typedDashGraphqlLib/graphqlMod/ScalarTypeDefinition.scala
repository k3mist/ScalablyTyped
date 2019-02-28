package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalarTypeDefinition
  extends TypeDefinition
     with Node {
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
  var name: Name
}

