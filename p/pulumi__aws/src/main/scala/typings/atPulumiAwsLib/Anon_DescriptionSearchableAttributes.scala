package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionSearchableAttributes extends js.Object {
  var description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var searchableAttributes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_DescriptionSearchableAttributes {
  @scala.inline
  def apply(
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    searchableAttributes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): Anon_DescriptionSearchableAttributes = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (searchableAttributes != null) __obj.updateDynamic("searchableAttributes")(searchableAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DescriptionSearchableAttributes]
  }
}

