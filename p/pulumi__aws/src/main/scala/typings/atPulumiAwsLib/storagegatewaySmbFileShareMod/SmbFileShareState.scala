package typings
package atPulumiAwsLib.storagegatewaySmbFileShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmbFileShareState extends js.Object {
  /**
    * Amazon Resource Name (ARN) of the SMB File Share.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The authentication method that users use to access the file share. Defaults to `ActiveDirectory`. Valid values: `ActiveDirectory`, `GuestAccess`.
    */
  val authentication: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The default storage class for objects put into an Amazon S3 bucket by the file gateway. Defaults to `S3_STANDARD`. Valid values: `S3_STANDARD`, `S3_STANDARD_IA`, `S3_ONEZONE_IA`.
    */
  val defaultStorageClass: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * ID of the SMB File Share.
    */
  val fileshareId: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the file gateway.
    */
  val gatewayArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean value that enables guessing of the MIME type for uploaded objects based on file extensions. Defaults to `true`.
    */
  val guessMimeTypeEnabled: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * A list of users in the Active Directory that are not allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val invalidUserLists: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Boolean value if `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Defaults to `false`.
    */
  val kmsEncrypted: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Amazon Resource Name (ARN) for KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is true.
    */
  val kmsKeyArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of the backed storage used for storing file data.
    */
  val locationArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Access Control List permission for S3 bucket objects. Defaults to `private`.
    */
  val objectAcl: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean to indicate write status of file share. File share does not accept writes if `true`. Defaults to `false`.
    */
  val readOnly: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean who pays the cost of the request and the data download from the Amazon S3 bucket. Set this value to `true` if you want the requester to pay instead of the bucket owner. Defaults to `false`.
    */
  val requesterPays: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the AWS Identity and Access Management (IAM) role that a file gateway assumes when it accesses the underlying storage.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
  /**
    * A list of users in the Active Directory that are allowed to access the file share. Only valid if `authentication` is set to `ActiveDirectory`.
    */
  val validUserLists: js.UndefOr[
    atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
  ] = js.undefined
}

object SmbFileShareState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    authentication: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    defaultStorageClass: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    fileshareId: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    gatewayArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    guessMimeTypeEnabled: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    invalidUserLists: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null,
    kmsEncrypted: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    kmsKeyArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    locationArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    objectAcl: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    readOnly: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    requesterPays: atPulumiPulumiLib.resourceMod.Input[scala.Boolean] = null,
    roleArn: atPulumiPulumiLib.resourceMod.Input[java.lang.String] = null,
    validUserLists: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]] = null
  ): SmbFileShareState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (authentication != null) __obj.updateDynamic("authentication")(authentication.asInstanceOf[js.Any])
    if (defaultStorageClass != null) __obj.updateDynamic("defaultStorageClass")(defaultStorageClass.asInstanceOf[js.Any])
    if (fileshareId != null) __obj.updateDynamic("fileshareId")(fileshareId.asInstanceOf[js.Any])
    if (gatewayArn != null) __obj.updateDynamic("gatewayArn")(gatewayArn.asInstanceOf[js.Any])
    if (guessMimeTypeEnabled != null) __obj.updateDynamic("guessMimeTypeEnabled")(guessMimeTypeEnabled.asInstanceOf[js.Any])
    if (invalidUserLists != null) __obj.updateDynamic("invalidUserLists")(invalidUserLists.asInstanceOf[js.Any])
    if (kmsEncrypted != null) __obj.updateDynamic("kmsEncrypted")(kmsEncrypted.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (locationArn != null) __obj.updateDynamic("locationArn")(locationArn.asInstanceOf[js.Any])
    if (objectAcl != null) __obj.updateDynamic("objectAcl")(objectAcl.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (requesterPays != null) __obj.updateDynamic("requesterPays")(requesterPays.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (validUserLists != null) __obj.updateDynamic("validUserLists")(validUserLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmbFileShareState]
  }
}

