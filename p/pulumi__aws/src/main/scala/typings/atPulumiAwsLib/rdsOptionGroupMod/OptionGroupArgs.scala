package typings
package atPulumiAwsLib.rdsOptionGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionGroupArgs extends js.Object {
  /**
    * Specifies the name of the engine that this option group should be associated with.
    */
  val engineName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * Specifies the major version of the engine that this option group should be associated with.
    */
  val majorEngineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
  /**
    * The Name of the setting.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`. Must be lowercase, to match as it is stored in AWS.
    */
  val namePrefix: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the option group. Defaults to "Managed by Terraform".
    */
  val optionGroupDescription: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of Options to apply.
    */
  val options: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DbSecurityGroupMembershipsOptionName]
      ]
    ]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object OptionGroupArgs {
  @scala.inline
  def apply(
    engineName: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    majorEngineVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String],
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    namePrefix: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    optionGroupDescription: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    options: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DbSecurityGroupMembershipsOptionName]
      ]
    ] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): OptionGroupArgs = {
    val __obj = js.Dynamic.literal(engineName = engineName.asInstanceOf[js.Any], majorEngineVersion = majorEngineVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (optionGroupDescription != null) __obj.updateDynamic("optionGroupDescription")(optionGroupDescription.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionGroupArgs]
  }
}

