package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerHostnameEnvironment extends js.Object {
  var containerHostname: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var environment: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var image: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var modelDataUrl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
}

object Anon_ContainerHostnameEnvironment {
  @scala.inline
  def apply(
    image: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    containerHostname: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    environment: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    modelDataUrl: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ContainerHostnameEnvironment = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (containerHostname != null) __obj.updateDynamic("containerHostname")(containerHostname.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (modelDataUrl != null) __obj.updateDynamic("modelDataUrl")(modelDataUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ContainerHostnameEnvironment]
  }
}

