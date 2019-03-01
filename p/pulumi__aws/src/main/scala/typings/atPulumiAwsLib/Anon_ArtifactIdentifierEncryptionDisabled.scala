package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArtifactIdentifierEncryptionDisabled extends js.Object {
  var artifactIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  var encryptionDisabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  var location: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var namespaceType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var packaging: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
}

object Anon_ArtifactIdentifierEncryptionDisabled {
  @scala.inline
  def apply(
    artifactIdentifier: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    encryptionDisabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    location: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namespaceType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    packaging: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    path: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null
  ): Anon_ArtifactIdentifierEncryptionDisabled = {
    val __obj = js.Dynamic.literal(artifactIdentifier = artifactIdentifier.asInstanceOf[js.Any], `type` = `type`.asInstanceOf[js.Any])
    if (encryptionDisabled != null) __obj.updateDynamic("encryptionDisabled")(encryptionDisabled.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namespaceType != null) __obj.updateDynamic("namespaceType")(namespaceType.asInstanceOf[js.Any])
    if (packaging != null) __obj.updateDynamic("packaging")(packaging.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArtifactIdentifierEncryptionDisabled]
  }
}

