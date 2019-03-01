package typings
package atPulumiAwsLib.ssmDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentState extends js.Object {
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The JSON or YAML content of the document.
    */
  val content: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The date the document was created.
    */
  val createdDate: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The default version of the document.
    */
  val defaultVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The description of the document.
    */
  val description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The format of the document. Valid document types include: `JSON` and `YAML`
    */
  val documentFormat: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of the document. Valid document types include: `Command`, `Policy`, `Automation` and `Session`
    */
  val documentType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The sha1 or sha256 of the document content
    */
  val hash: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * "Sha1" "Sha256". The hashing algorithm used when hashing the content.
    */
  val hashType: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The latest version of the document.
    */
  val latestVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the document.
    */
  val name: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS user account of the person who created the document.
    */
  val owner: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The parameters that are available to this document.
    */
  val parameters: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DefaultValueDescriptionName]
      ]
    ]
  ] = js.undefined
  /**
    * Additional Permissions to attach to the document. See Permissions below for details.
    */
  val permissions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AccountIdsTypeInput]] = js.undefined
  /**
    * A list of OS platforms compatible with this SSM document, either "Windows" or "Linux".
    */
  val platformTypes: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * The schema version of the document.
    */
  val schemaVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * "Creating", "Active" or "Deleting". The current status of the document.
    */
  val status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.undefined
}

object DocumentState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    content: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    createdDate: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    defaultVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    documentFormat: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    documentType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    hash: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    hashType: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    latestVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    name: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    owner: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    parameters: atPulumiPulumiLib.resourceMod.Input[
      js.Array[
        atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_DefaultValueDescriptionName]
      ]
    ] = null,
    permissions: atPulumiPulumiLib.resourceMod.Input[atPulumiAwsLib.Anon_AccountIdsTypeInput] = null,
    platformTypes: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    schemaVersion: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    status: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.resourceMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): DocumentState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (defaultVersion != null) __obj.updateDynamic("defaultVersion")(defaultVersion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (documentFormat != null) __obj.updateDynamic("documentFormat")(documentFormat.asInstanceOf[js.Any])
    if (documentType != null) __obj.updateDynamic("documentType")(documentType.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (hashType != null) __obj.updateDynamic("hashType")(hashType.asInstanceOf[js.Any])
    if (latestVersion != null) __obj.updateDynamic("latestVersion")(latestVersion.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (permissions != null) __obj.updateDynamic("permissions")(permissions.asInstanceOf[js.Any])
    if (platformTypes != null) __obj.updateDynamic("platformTypes")(platformTypes.asInstanceOf[js.Any])
    if (schemaVersion != null) __obj.updateDynamic("schemaVersion")(schemaVersion.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentState]
  }
}

