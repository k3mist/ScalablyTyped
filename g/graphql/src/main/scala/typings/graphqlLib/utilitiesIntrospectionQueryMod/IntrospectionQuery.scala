package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionQuery extends js.Object {
  val __schema: IntrospectionSchema
}

object IntrospectionQuery {
  @scala.inline
  def apply(__schema: IntrospectionSchema): IntrospectionQuery = {
    val __obj = js.Dynamic.literal(__schema = __schema)
  
    __obj.asInstanceOf[IntrospectionQuery]
  }
}

