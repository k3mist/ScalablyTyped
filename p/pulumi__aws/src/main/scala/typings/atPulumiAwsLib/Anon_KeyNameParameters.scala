package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyNameParameters extends js.Object {
  var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var parameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  var serializationLibrary: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_KeyNameParameters {
  @scala.inline
  def apply(
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.resourceMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]
    ] = null,
    serializationLibrary: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_KeyNameParameters = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (serializationLibrary != null) __obj.updateDynamic("serializationLibrary")(serializationLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeyNameParameters]
  }
}

