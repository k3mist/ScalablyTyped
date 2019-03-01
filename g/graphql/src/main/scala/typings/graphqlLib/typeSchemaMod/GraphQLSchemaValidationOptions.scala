package typings
package graphqlLib.typeSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLSchemaValidationOptions extends js.Object {
  /**
    * If provided, the schema will consider fields or types with names included
    * in this list valid, even if they do not adhere to the specification's
    * schema validation rules.
    *
    * This option is provided to ease adoption and will be removed in v15.
    */
  var allowedLegacyNames: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[js.Array[java.lang.String]]] = js.undefined
  /**
    * When building a schema from a GraphQL service's introspection result, it
    * might be safe to assume the schema is valid. Set to true to assume the
    * produced schema is valid.
    *
    * Default: false
    */
  var assumeValid: js.UndefOr[scala.Boolean] = js.undefined
}

object GraphQLSchemaValidationOptions {
  @scala.inline
  def apply(
    allowedLegacyNames: graphqlLib.tsutilsMaybeMod.Maybe[js.Array[java.lang.String]] = null,
    assumeValid: js.UndefOr[scala.Boolean] = js.undefined
  ): GraphQLSchemaValidationOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedLegacyNames != null) __obj.updateDynamic("allowedLegacyNames")(allowedLegacyNames.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeValid)) __obj.updateDynamic("assumeValid")(assumeValid)
    __obj.asInstanceOf[GraphQLSchemaValidationOptions]
  }
}

