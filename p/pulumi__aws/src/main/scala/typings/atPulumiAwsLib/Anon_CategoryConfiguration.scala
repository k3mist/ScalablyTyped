package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CategoryConfiguration extends js.Object {
  var category: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var configuration: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
  var inputArtifacts: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var outputArtifacts: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  var owner: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var provider: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var roleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var runOrder: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
  var version: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_CategoryConfiguration {
  @scala.inline
  def apply(
    category: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    owner: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    provider: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    version: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    configuration: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    inputArtifacts: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    outputArtifacts: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    runOrder: atPulumiPulumiLib.resourceMod.Input[scala.Double] = null
  ): Anon_CategoryConfiguration = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (inputArtifacts != null) __obj.updateDynamic("inputArtifacts")(inputArtifacts.asInstanceOf[js.Any])
    if (outputArtifacts != null) __obj.updateDynamic("outputArtifacts")(outputArtifacts.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (runOrder != null) __obj.updateDynamic("runOrder")(runOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CategoryConfiguration]
  }
}

