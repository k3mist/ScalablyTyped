package typings
package typedDashGraphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeExtensionDefinition
  extends TypeDefinition
     with Node {
  var definition: ObjectTypeDefinition
  var kind: java.lang.String
  var loc: js.UndefOr[Location] = js.undefined
}

